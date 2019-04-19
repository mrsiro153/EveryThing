package citad;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlConverter {
    public static String objectToXml(Object obj) {
        try {
            StringWriter sw = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.encoding", "UTF-8");
            marshaller.marshal(obj, sw);
            return sw.toString();
        } catch (JAXBException var4) {
            var4.printStackTrace();
        }
        throw new RuntimeException("Unknown");
    }

    public static Object fromXml(String xml, Object object) {
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Object result = unmarshaller.unmarshal(new StringReader(xml));
            return result;
        } catch (JAXBException var5) {
            var5.printStackTrace();
        }
        throw new RuntimeException("Unknown");
    }

    public static String objectToXmlNoHeader(Object obj) {
        try {
            StringWriter sw = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.fragment", Boolean.TRUE);
            marshaller.marshal(obj, sw);
            return sw.toString();
        } catch (JAXBException var4) {
            var4.printStackTrace();
        }
        throw new RuntimeException("Unknown");
    }
}
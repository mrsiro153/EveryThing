package annotationInterface.pk;

import java.lang.reflect.Method;

public class AnnotationExample{

    @MyFirstAnnotation(value="DOACTION")
    public void doBatting(){
        System.out.println("Batting performed");
    }
    public void doBowling(){
        System.out.println("Bowling performed");
    }
    public static void main(String[] args) throws Exception {
        {
            AnnotationExample anExample=new AnnotationExample();
            Method[] methodsArray=anExample.getClass().getMethods();
            System.out.println("Number of method: "+methodsArray.length);
            for(int i=0;i<methodsArray.length;i++){
                Method method=methodsArray[i];
                if(method.isAnnotationPresent(MyFirstAnnotation.class)){
                    MyFirstAnnotation myAnnObject=(method.getAnnotation(MyFirstAnnotation.class));
                    System.out.println("My annotation value:"+myAnnObject.value());
                    method.invoke(anExample, null);
                }else{
                    System.out.println("No annotation !!!!!!!!!!!!!!!!!");
                }
            }
        }
    }
}

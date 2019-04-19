/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 28/03/2019
 * Time: 5:51 PM
 */
public class Chaudeptrai {

    public static void main(String[] args) {
        String input = "Cho phép nhập tiếng Việt có dấu, các ký tự ! % & * ( ) _ -\t= + \" / \\ ? > < ; : , . @ và khoảng trắng";
        String regex = "^[a-zA-Z0-9_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêếìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệiỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựýỳỵỷỹ.!%&*()_=+\"/\\\\?><;:,.@\\- ]+$";
        if (!input.matches(regex)) {
            System.out.println("Deptrai");
        }
    }

}

package codeWithoutIf.demo2;


public enum BookEnum {
    HARRY_POTTER(1,"harry potter") {
        @Override
        public void doSomething(Object x) {
            System.out.println("name of class: " + x);
            HarryPotter h = (HarryPotter) x;
            System.out.println("Harry potter in Enum method: "+h);
            h.harryPotterMethod();
        }
    },
    VAMPIRE(2,"vampire") {
        @Override
        public void doSomething(Object x) {
            System.out.println("name of class: " + x);
            Vampire v = (Vampire) x;
            v.vampireMethod();
        }
    };
    private Integer code;
    private String name;

    BookEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    //
    public abstract void doSomething(Object x);

    public static BookEnum getByCode(int code){
        for(BookEnum b : BookEnum.values()){
            if (b.getCode().equals(code)) return b;
        }
        return BookEnum.VAMPIRE;
    }


}

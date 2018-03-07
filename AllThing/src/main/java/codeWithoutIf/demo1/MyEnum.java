package codeWithoutIf.demo1;

public enum MyEnum {
    CASE1(1, "aa") {
        @Override
        public void doSomething(MyService myService) {
            Service1 s = (Service1) myService;
            s.abcd();
            System.out.println("code of Enum: "+this.getCode());
        }
    },
    CASE2(2, "bb") {
        @Override
        public void doSomething(MyService myService) {
            Service1 s = (Service1) myService;
            s.abcd();
            System.out.println("code of Enum: "+this.getCode());
        }
    },
    CASE3(3, "cc") {
        @Override
        public void doSomething(MyService myService) {
            Service2 s = (Service2) myService;
            s.adbsd();
            System.out.println("code of Enum: "+this.getCode());
        }
    },
    DEFAULT_ENUM(999, "default") {
        @Override
        public void doSomething(MyService myService) {
            Service2 s = (Service2) myService;
            s.adbsd();
            System.out.println("code of Enum: "+this.getCode());
        }
    };
    private Integer code;
    private String data;

    public Integer getCode() {
        return code;
    }

    public String getData() {
        return data;
    }

    public abstract void doSomething(MyService myService);

    MyEnum(Integer code, String data) {
        this.code = code;
        this.data = data;
    }

    public static MyEnum getByCode(Integer code) {
        for (MyEnum m : MyEnum.values()) {
            if (m.getCode().equals(code)) return m;
        }
        return DEFAULT_ENUM;
    }
}

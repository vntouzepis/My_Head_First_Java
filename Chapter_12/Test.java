class Test {
    int instVar;

    Test(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Test obj = new Test(8);

        System.out.println("object reference = " + obj);
    }
}


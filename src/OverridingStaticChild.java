 class OverridingStaticChild extends OverridingwithStatic {
     public static void method1() {
         System.out.println("child class");
     }


    public static void main(String[] args) {
        OverridingStaticChild child1=new OverridingStaticChild();
        child1.method1();
        OverridingwithStatic parent1=new OverridingwithStatic();
        parent1.method1();
        OverridingwithStatic parent=new OverridingStaticChild();
        parent.method1();
        
    }
}

package constructor;
class getAnimal{
    public static void main(String[] args) {
        Animal a1=Animal.getAnimalObj("tiger","12","1200");
        System.out.println("before modify");
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
        System.out.println(a1.getWeigth());
        System.out.println("************************************************");
        System.out.println("After modify");
        a1.setName("Lion");
        a1.setAge("14");
        a1.setWeight("12345");
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
        System.out.println(a1.getWeigth());



        
    }
    
    

}
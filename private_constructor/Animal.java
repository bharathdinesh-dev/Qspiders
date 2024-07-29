package constructor;

class Animal{
    private String name,age,weight;
    private Animal(){}
    private Animal(String name,String age,String weight){
        this.name= name;
        this.age=age;
        this.weight=weight;
    }
    public static Animal getAnimalObj(String name,String age,String weight){
        return new Animal(name,age,weight);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getWeigth(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight=weight;
    }

}
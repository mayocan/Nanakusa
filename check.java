class Human{
    String name;
    int age;
    boolean isMale = true;
    int height;

    public Human(String name,int age,boolean isMale,int height){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.height = height;
        System.out.println("name:" + name + "|age:" + age + "|isMale:" + isMale + "|height:" + height );
    }
}

class check{
    public static void main(String args[]){
        Human Naka = new Human("Yuki Naka",18,true,175);
        Human Yaguruma = new Human("Rine Yaguruma",11,false,190 );
        Human als = new Human ("Ars Almal",16,false,147);
        Human Sango = new Human("Sango Suo",12,false,148);
    }
}
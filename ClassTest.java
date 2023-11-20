class insect{
    int x_size;
    int y_size;
    int wing;
    String name;

}

class ClassTest {
    static public void main(String args[]){
        insect ant = new insect();
        ant.x_size = 2;
        ant.y_size = 5;
        ant.wing = 1;
        ant.name = "Ari";
        int antSize = ant.x_size * ant.y_size;
        System.out.println( ant.name + " Size:" + antSize );
        insect fly = new insect();
        fly.x_size = 1;
        fly.y_size = 1;
        fly.wing = 3;
        fly.name = "Hae";
        int flySize = fly.x_size * fly.y_size;
        System.out.println( fly.name + " Size:" + flySize );


    }
}
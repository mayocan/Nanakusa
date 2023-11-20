class insect{
    String name;
    int x_size;
    int y_size;
    int Size;
    public insect ( String name, int x_size, int y_size){
        this.name = name;
        this.x_size = x_size;
        this.y_size = y_size;
        this.Size = x_size * y_size;
    }

}

class ConstractTest {
    static public void main(String args[]){
        insect ant = new insect("Ari", 2 , 3 );
        System.out.println( ant.name + " Size:" + ant.Size );
        insect fly = new insect("Hae", 1, 2);
        System.out.println( fly.name + " Size:" + fly.Size );


    }
}
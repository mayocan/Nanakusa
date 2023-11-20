public class HeroAtkCommand extends Command{
    int enemyAtk;
    int enemyDef;
    int heroAtk;
    int atkNum;
    int enemyDmg;
    public HeroAtkCommand(int commandNum, int enemyAtk,int enemyDef, int heroAtk,int atkNum){
        super(commandNum);
        this.enemyAtk = enemyAtk;
        this.enemyDef = enemyDef;
        this.heroAtk = heroAtk;
        this.atkNum = atkNum;
        this.enemyDmg = (( heroAtk - enemyAtk ) * atkNum) * ( enemyDef/1000 );
    }
}
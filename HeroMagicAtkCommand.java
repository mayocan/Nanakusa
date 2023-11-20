public class HeroMagicAtkCommand extends Command{
    int enemyAtk;
    int enemyDef;
    int heroAtk;
    int heroMp;
    int magicNum;
    int mpCost;
    int enemyDmg;
    String result;
    public HeroMagicAtkCommand(int commandNum, int enemyAtk,int enemyDef, int heroAtk, int heroMp,int mpCost ,int magicNum){
        super(commandNum);
        this.enemyAtk = enemyAtk;
        this.enemyDef = enemyDef;
        this.heroAtk = heroAtk;
        this.heroMp = heroMp;
        this.atkNum = magicNum;
        if (heroMp > mpCost){
            this.enemyDmg = (( heroAtk - enemyAtk ) * magicNum) * ( enemyDef/500 );
            this.result = " ";
        }else{
            this.result = "Your MP is not enough!";
        }
        
    }
}
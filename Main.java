package breeding;

public class Main {
    public static void main(String[] args) {

        Monster mon = new Monster();
        mon.setName("なほみん");
        mon.setHp(100);
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());

        mon.talk();
        mon.walk(2);
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());

        mon.walk(10);
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());

        System.out.println(mon.eat("サラダ"));
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());

        System.out.println(mon.eat("やきにく"));
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());

        mon.cure("やくそう");
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());

        mon.cure("特やくそう");
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());

        mon.cure("くさ");
        System.out.println("名前：" + mon.getName() + " " + "HP：" + mon.getHp());
    }
}
//リファクタリング→低数値に切り出す。
//　　　　　　　　→名前、HPの出力処理メソッド化。

//リファクタリング　修正しやすさ。ソースを見やすく。コメント。わかりやすい変数名。※ソースの整理
//定数　定まった値　WALK_MINUTE　　代入不可
//変数　変化する値　walkMinute

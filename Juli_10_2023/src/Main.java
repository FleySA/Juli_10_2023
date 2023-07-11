import Prognoz.Pogoda;

public class Main {
    public static void main(String[] args) {
        Pogoda dninedeliBox = new Pogoda();

        System.out.println(dninedeliBox.PrPn);
        System.out.println(dninedeliBox.pon1 + dninedeliBox.pon2 + dninedeliBox.pon);
        System.out.println(dninedeliBox.vt1 +dninedeliBox.vt2 + dninedeliBox.vt);
        System.out.println(dninedeliBox.sr1 + dninedeliBox.sr2 + dninedeliBox.sr);
        System.out.println(dninedeliBox.cht1 + dninedeliBox.cht2 + dninedeliBox.cht);
        System.out.println(dninedeliBox.pt1 + dninedeliBox.pt2 + dninedeliBox.pt);
        System.out.println(dninedeliBox.sb1 + dninedeliBox.sb2 + dninedeliBox.sb);
        System.out.println(dninedeliBox.vs1 + dninedeliBox.vs2 + dninedeliBox.vs);
        
    }
}
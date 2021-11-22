import java.applet.Applet;
import java.awt.*;

/*
<applet code="Tut_2.class" width=400 height=400></applet>
*/
public class Tut_2 extends Applet {

    public void init() {
        List l = new List(10);

        l.add("Afghanistan");
        l.add("Albania");
        l.add("Algeria");
        l.add("Andorra");
        l.add("Angola");
        l.add("Antigua and Barbuda");
        l.add("Argentina");
        l.add("Armenia");
        l.add("Australia");
        l.add("Austria");
        l.add("Austrian Empire");
        l.add("Azerbaijan");

        add(l);

        List l2 = new List(5, true);
        l2.add("Dainik Jagran (Hindi)");
        l2.add("Hindustan (Hindi) ");
        l2.add("Dainik Bhaskar (Hindi)");
        l2.add("Malayala Manorama (Malayalam) ");
        l2.add("Daily Thanthi (Tamil) ");
        add(l2);
    }

}

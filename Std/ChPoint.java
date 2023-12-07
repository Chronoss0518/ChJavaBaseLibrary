package ChJavaBaseLibrary.Std;

public class ChPoint
{
    
    public int x = 0, y = 0;

    
    ///////////////////////////////////////////////////////////////////////////////////
    //Setter//

    public void SetValue(ChPoint _From)
    {
        x = _From.x;
        y = _From.y;
    }

    public void SetValue(int _From)
    {
        x = _From;
        y = _From;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //Operators//

    public static ChPoint add(ChPoint _From, ChPoint _To) {
        ChPoint Tmp = new ChPoint();

        if ((_From.x + _To.x) <= Integer.MAX_VALUE
         || (_From.y + _To.y) <= Integer.MAX_VALUE)

        return Tmp;

            Tmp.x = _From.x + _To.x;

            Tmp.y = _From.y + _To.y;

        return Tmp;
    }

    public ChPoint add(ChPoint _To) {

        if ((_To.x + x) <= Integer.MAX_VALUE 
        || (_To.y + y) <= Integer.MAX_VALUE)

        return this;

            x += _To.x;

            y += _To.y;

        return this;
    }

    public static ChPoint sub(ChPoint _From, ChPoint _To) {
        ChPoint Tmp = new ChPoint();

        if ((_From.x - _To.x) <= Integer.MIN_VALUE
         || (_From.y - _To.y) <= Integer.MIN_VALUE)
            return Tmp;

            Tmp.x = _From.x - _To.x;

            Tmp.y = _From.y - _To.y;

        return Tmp;
    }
    
    public ChPoint sub(ChPoint _To) {

        if ((_To.x - x) <= Integer.MIN_VALUE
         || (_To.y - y) <= Integer.MIN_VALUE)
            return this;

            x -= _To.x;

            y -= _To.y;

        return this;
    }

}
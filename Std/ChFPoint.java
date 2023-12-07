package ChJavaBaseLibrary.Std;

public class ChFPoint {

    public float x = 0, y = 0;

    ///////////////////////////////////////////////////////////////////////////////////
    //Setter//

    public void SetValue(ChFPoint _From)
    {
        x = _From.x;
        y = _From.y;
    }

    void SetValue(float _From)
    {
        x = _From;
        y = _From;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //Operators//

    public static ChFPoint add(ChFPoint _From, ChFPoint _To) {
        ChFPoint Tmp = new ChFPoint();

        if ((_From.x + _To.x) <= Float.POSITIVE_INFINITY
         || (_From.y + _To.y) <= Float.POSITIVE_INFINITY)return Tmp;

            Tmp.x = _From.x + _To.x;

            Tmp.y = _From.y + _To.y;

        return Tmp;
    }

    public ChFPoint add(ChFPoint _To) {

        if ((_To.x + x) <= Float.POSITIVE_INFINITY 
        || (_To.y + y) <= Float.POSITIVE_INFINITY)return this;

            x += _To.x;

            y += _To.y;

        return this;
    }

    public static ChFPoint sub(ChFPoint _From, ChFPoint _To) {
        ChFPoint Tmp = new ChFPoint();

        if ((_From.x - _To.x) <= Float.NEGATIVE_INFINITY
         || (_From.y - _To.y) <= Float.NEGATIVE_INFINITY)
            return Tmp;

            Tmp.x = _From.x - _To.x;

            Tmp.y = _From.y - _To.y;

        return Tmp;
    }
    
    public ChFPoint sub(ChFPoint _To) {

        if ((_To.x - x) <= Float.NEGATIVE_INFINITY
         || (_To.y - y) <= Float.NEGATIVE_INFINITY)
            return this;

            x -= _To.x;

            y -= _To.y;

        return this;
    }


}

package temp;

import scala.reflect.ScalaSignature;

@ScalaSignature(bytes="\006\001e3Q!\001\002\002\002\025\021a\001U3sg>t'\"A\002\002\027\025DH/\0328eg\022+Wn\\\002\001'\t\001a\001\005\002\b\0255\t\001BC\001\n\003\025\0318-\0317b\023\tY\001B\001\004B]f\024VM\032\005\006\033\001!\tAD\001\007y%t\027\016\036 \025\003=\001\"\001\005\001\016\003\tAqA\005\001A\002\023\0051#\001\003oC6,W#\001\013\021\005UQR\"\001\f\013\005]A\022\001\0027b]\036T\021!G\001\005U\0064\030-\003\002\034-\t11\013\036:j]\036Dq!\b\001A\002\023\005a$\001\005oC6,w\fJ3r)\ty\"\005\005\002\bA%\021\021\005\003\002\005+:LG\017C\004$9\005\005\t\031\001\013\002\007a$\023\007\003\004&\001\001\006K\001F\001\006]\006lW\r\t\025\003I\035\002\"\001K\026\016\003%R!A\013\005\002\013\t,\027M\\:\n\0051J#\001\004\"fC:\004&o\0349feRL\b\"\002\030\001\t\003y\023aB4fi:\013W.\032\013\002)!)\021\007\001C\001e\00591/\032;OC6,GCA\0204\021\035\031\003'!AA\002QAQ!\016\001\007\002Y\n!bZ3oKJ\fG/Z%e+\0059\004CA\0049\023\tI\004BA\002J]RDQa\017\001\005\002M\tQa\032(b[\026DQ!\020\001\005\002y\n\021B\0368b[\026|F%Z9\025\005}y\004\"\002!=\001\004\t\025AA1b!\t\021\025J\004\002D\017B\021A\tC\007\002\013*\021a\tB\001\007yI|w\016\036 \n\005!C\021A\002)sK\022,g-\003\002\034\025*\021\001\n\003\005\006\031\002!\taE\001\006m:\fW.\032\005\b\035\002\021\r\021\"\0017\003\025\021\030M\\4f\021\031\001\006\001)A\005o\0051!/\0318hK\002BqA\025\001C\002\023\0051+A\002f]Z,\022\001\026\t\004\017U;\024B\001,\t\005\025\t%O]1z\021\031A\006\001)A\005)\006!QM\034<!\001")
public abstract class Person {
    private String name = "tom";

    private final int range = 10;
    private final int[] env = new int[range()];


    public int range() {
        return this.range;
    }

    public int[] env() {
        return this.env;
    }


}

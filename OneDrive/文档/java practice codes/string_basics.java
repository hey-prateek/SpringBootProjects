public class string_basics {

    public static void main(String[] args) {
        
        // declaring a string
        String str="hello";
        System.out.println(str.length());

        // 2 ways -> normal way, new keyword
        // second way
        String str1=new String("hello1");
        System.out.println(str1);

        // string buffer
        StringBuffer sb_empty=new StringBuffer();
        StringBuffer sb_with_size=new StringBuffer(5);
        StringBuffer sb=new StringBuffer("hello2");
        System.out.println(sb+" "+sb_empty+" "+sb_with_size);

        // string creation using char array
        char carr[]={'a','b','c'};
        String str2=new String(carr);
        System.out.println(str2);

        // .concat() method
        String str3="muskan";
        str3=str3.concat(" <3 prateek");
        System.out.println(str3);

        // string builder
        StringBuilder sbl=new StringBuilder();
        StringBuilder sbl1=new StringBuilder(10);
        StringBuilder sb2=new StringBuilder("muskan <3 <3 <3 <3 prateek");
        System.out.println(sb2);

    }
    
}

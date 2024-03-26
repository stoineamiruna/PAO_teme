package String;

public class Application_ex1 {
    public static void main(String[] args) {
        String sir;

        sir = "a";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [abc]: ");
        if(sir.matches("[abc]"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "d";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [^abc]: ");
        if(sir.matches("[^abc]"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "m";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [a-z]: ");
        if(sir.matches("[a-z]"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "M";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [a-zA-Z]: ");
        if(sir.matches("[a-zA-Z]"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "aM";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [a-z][A-Z]: ");
        if(sir.matches("[a-z][A-Z]"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "abbc";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [abc]+: ");
        if(sir.matches("[abc]+"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "aabc";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [abc]*: ");
        if(sir.matches("[abc]*"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "aacaa";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [abc]{5}: ");
        if(sir.matches("[abc]{5}"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "aaaaaaaaaaaa";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [abc]]{5,: ");
        if(sir.matches("[abc]{5,}"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

        sir = "aaaaaaaaaa";
        System.out.println("Sirul "+sir+" se/ nu se potriveste cu regexul [abc]{5,10}: ");
        if(sir.matches("[abc]{5,10}"))
            System.out.print("DA\n\n");
        else
            System.out.print("NU\n\n");

    }

}

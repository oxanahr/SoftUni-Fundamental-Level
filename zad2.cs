using System;


namespace ConsoleApplication
{
    public class Program
    {
        public static void Main(string[] args)
        {   
            string seq = Console.ReadLine();
            Char [] pos = seq.ToCharArray();
            int i=0, p=0;
            for (i=0; true; i+=p) {
            if (i>seq.Length||i<0) {
            Console.WriteLine("Djor and Djano are lost at {0}!", i);
            break;}
            if (Char.IsLower(pos[i])) {
            p = pos[i]-'a';
            } else  if (Char.IsUpper(pos[i])) { 
            p = (-1)*pos[i]-'A';
            } else if (pos[i]=='^'){
                p=i;
            Console.WriteLine("Djor and Djano are at the party at {0}!", i);
            break;
                }
            }
        }
    }
}
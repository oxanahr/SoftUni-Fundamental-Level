using System;


namespace ConsoleApplication
{
    public class Program
    {
        public static void Main(string[] args)
        {   string seq, acc = "";
            int i, j=0, len=0, S, E, line=1;
            seq = Console.ReadLine();
            char [] skip;
    while (seq!="end") {
            seq = Console.ReadLine();
            S = Int32.Parse(seq);
            seq = Console.ReadLine(); 
            E = Int32.Parse(seq);        
            seq = Console.ReadLine();
            len = seq.Length;
            S=S<0?len-S:S;
            E=E<0?len-E:E;
            skip = seq.ToCharArray();
            for (i=S; i<=E ; i+=(line%2!=0)?3:4){
            acc+= skip [i].ToString();
            }  line++;
                         
            }

            Console.WriteLine(acc);

         }
     } 
 }
            

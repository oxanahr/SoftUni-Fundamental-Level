        static void Main(string[] args)
        {
            string num1 = Console.ReadLine();
            double result;

            if (int.Parse(num1[1].ToString())%2 == 0)
            {
                result = (double.Parse(num1[0].ToString()) + double.Parse(num1[1].ToString()))* double.Parse(num1[2].ToString());
            }
            else
            {
                result = (double.Parse(num1[0].ToString()) * double.Parse(num1[1].ToString())) / double.Parse(num1[2].ToString());
            }
            Console.WriteLine("{0:f2}", result);
        }
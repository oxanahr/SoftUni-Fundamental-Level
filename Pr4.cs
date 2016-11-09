static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            string[] input = new string[N];
            string[] merged = new string[N - 1];
            int[] summing = new int[N - 1];

            input[0] = Console.ReadLine();

            for (int i = 1; i < N; i++)
            {
                input[i] = Console.ReadLine();
                merged[i - 1] = input[i - 1][1].ToString() + input[i][0].ToString();
                summing[i - 1] = int.Parse(input[i - 1]) + int.Parse(input[i]);
            }

            for (int i = 0; i < N - 1; i++)
            {
                Console.Write(merged[i]);
                if (i < N - 2)
                {
                    Console.Write(' ');
                }
            }
            Console.WriteLine();

            for (int i = 0; i < N - 1; i++)
            {
                Console.Write(summing[i]);
                if (i < N - 2)
                {
                    Console.Write(' ');
                }
            }
            Console.WriteLine();
        }
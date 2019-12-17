using System;

namespace derangementGenerator
{
    class Program
    {

        public static int[] derange(int n)
        {
            int[] arr = new int[n];
            Random r = new Random();

            for(int i = 0; i < n; i++)
            {
                arr[i] = -1;
            }
            int tmp = r.Next(0,n) ;

            for(int i = 0; i < n; i++)
            {
                do 
                {
                    tmp = r.Next(0,n) ;
                } 
                while(arr[tmp ] > -1 || (tmp  == i) );
                arr[tmp ] = i;
            }

            return arr;
        }



        static void Main(string[] args)
        {
            int[] asd = derange(6);
            
            Console.WriteLine(String.Join(", ", asd));
        }
    }
}

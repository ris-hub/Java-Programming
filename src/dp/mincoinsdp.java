package dp;

import java.util.Arrays;

public class mincoinsdp {

        public static void main(String[] args) {

            int n=20;
            int a[] = {7, 5, 1};
            int dp[] = new int[n+1];
            dp[0]=0 ;
            Arrays.fill(dp, -1);
            int ans = minCoins(n, a, dp);
            System.out.println(ans);

            System.out.println(Arrays.toString(dp));
        }

        static int minCoins(int n,  int a[], int dp[]){
            if(n==0)
                return 0;
            int ans=Integer.MAX_VALUE;

            for(int i=0;i<a.length;i++){
                if(n - a[i] >=0){
                    int subAns=0;
                    if(dp[n-a[i]] != -1)
                        subAns= dp[n-a[i]];
                    else
                        subAns= minCoins(n-a[i],a, dp);

                    if(subAns != Integer.MAX_VALUE && subAns+1 < ans)
                        ans = subAns + 1;
                }
            }
            dp[n]=ans;
            return dp[n];
        }
    }



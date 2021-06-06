package nexon_;//package nexon_;
//
//public class a1111 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 String names[] = {  "{}[]()",
//                 "{[}]",
//              };
//		 
//		 
//		 braces(names);
//	}
//	
//
//    /*
//     * Complete the function below.
//     */
//    static String[] braces(String[] values) {
//     
//    	
//    	String[] result = new String[values.length];
//    	
//        for(int i = 0 ; i < values.length ; i++)
//        {
//            int a = 0, b = 0 , c = 0; 
//            int cnt = 0;
//            String strCase = values[i];
//            for(int j = 0; j < strCase.length() -1; j++)
//            {
//               if('[' == strCase.charAt(j))
//               {
//            	   a++;
//            	   cnt++;
//            	   if ( ']' == strCase.charAt(j+1))
//                   {
//                	   	a--;
//                   }
//               }
//               else if('{' == strCase.charAt(j))
//               {
//            	   b++;
//            	   cnt++;
//            	   if ('}' == strCase.charAt(j+1))
//                   {
//                	   
//                	   b--;
//                   }
//               }
//               else if('(' == strCase.charAt(j))
//               {
//            	   c++;
//            	   cnt++;
//            	   if (')' == strCase.charAt(j+1))
//                   {
//                	   c--;
//                   }
//               }
//              
//            }
//            if(cnt > 0 && a == 0 && b == 0 && c == 0)
//            {
//            	result[i] = "YES";
//            }
//            else
//            {
//            	result[i] = "NO";
//            }
//            System.out.println(result[i]);
//        }
//        return result;
//    
//    
//    }
//
//
//}

package toss;

public class Fourth {
    public static int m,n;
    public static void main(String[] args) {

        sol("1 3\\nSHOW\\nNEXT\\nEXIT");
    }
    public static void sol(String input){
        String[] arr=input.split("\\\\n");
        StringBuffer sb = new StringBuffer();
        sb.append(arr[0]);
        String[] in=arr[0].split(" ");
        m=Integer.parseInt(in[0]); //m일동안
        n=Integer.parseInt(in[1]); //n회노출
        int day=0;
        int cnt=0;
        int limit=m;
        for(int i=1;i<arr.length;i++){
            sb.append("\\\n");
            if(arr[i].equals("SHOW")){
                if(okay(cnt, day)){
                    cnt++;
                    sb.append(1);
                }else{
                    cnt=0;
                    sb.append(0);
                }
            }else if(arr[i].equals("NEGATIVE")){
                sb.append(0);
            }else if(arr[i].equals("NEXT")){
                sb.append("-");
                day++;
            }else if(arr[i].equals("EXIT")){
                sb.append("BYE");
                break;
            }
        }
        System.out.println(sb.toString());
    }
    public static boolean okay(int cnt,int day){
        if(cnt<n||day<m)
        return true;
        return false;
    }

}

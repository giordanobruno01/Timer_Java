class timer {

     String time = "";

    public timer(String time) {
        this.time = time;
    }
//input 02:59:60
    public int[] decrease(int[] arr){
        if(arr[1]==0 && arr[0]!=0){
            arr[0]--;
            arr[1] =60;
        }
        if(arr[2]==0 && arr[1]!=0){
            arr[1]--;
            arr[2]=60;
        }

        return arr;
    }

    public void countTime() {
        String timeArr[] = time.split(":");
        int arr[] = new int[3];
        
        arr[0]= Integer.parseInt(timeArr[0]);
        arr[1] = Integer.parseInt(timeArr[1]);
        arr[2] = Integer.parseInt(timeArr[2]);
        if(arr[1]>59 || arr[2]>59){
            System.out.println("invalid time");
            return;
        }
        while(arr[0]!=0 || arr[1]!=0 || arr[2]!=0){
            try{
            System.out.print("\r"+arr[0] +":"+arr[1]+":"+arr[2]);
            arr = decrease(arr);
            arr[2]--;
            Thread.sleep(1000);
            System.out.print("\b ");
            
        }catch(Exception e){
            
        }
        }
    }

}
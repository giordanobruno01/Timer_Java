class timer {

    String time = "";

    public timer(String time) {
        this.time = time;
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
            System.out.print(arr[0] +":"+arr[1]+":"+arr[2]+"\r");
            arr[2]--;
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
        }
    }

}
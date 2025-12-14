class FindVolume {
    int length;
    int width;
    int height;


    int volume() {
        return length * width * height;
    }

    public static void main (String[] args){
        FindVolume vol = new FindVolume();

        vol.length = 30;
        vol.width = 20;
        vol.height = 20;

        int cubeVolume = vol.volume();
        System.out.println(cubeVolume);
    }
}

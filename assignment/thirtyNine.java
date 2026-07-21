// Write a program in Java to implement Interface for Multiple Inheritance

public class thirtyNine {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.call();
        phone.playMusic();
        phone.takePhoto();
    }
}

interface Callable {
    void call();
}

interface MusicPlayer {
    void playMusic();
}

interface Camera {
    void takePhoto();
}

// SmartPhone implements THREE interfaces - this is multiple inheritance in Java
class SmartPhone implements Callable, MusicPlayer, Camera {
    @Override
    public void call() {
        System.out.println("Calling a contact...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }
}

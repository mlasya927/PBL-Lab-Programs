public class VideoStore {
    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[100];
        count = 0;
    }

    public void addVideo(String name) {
        store[count] = new Video(name);
        count++;
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    private int findVideo(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void doCheckout(String name) {
        int index = findVideo(name);
        if (index == -1) {
            System.out.println("Video \"" + name + "\" not found.");
            return;
        }
        store[index].doCheckout();
        System.out.println("Video \"" + name + "\" checked out successfully.");
    }

    public void doReturn(String name) {
        int index = findVideo(name);
        if (index == -1) {
            System.out.println("Video \"" + name + "\" not found.");
            return;
        }
        store[index].doReturn();
        System.out.println("Video \"" + name + "\" returned successfully.");
    }

    public void receiveRating(String name, int rating) {
        int index = findVideo(name);
        if (index == -1) {
            System.out.println("Video \"" + name + "\" not found.");
            return;
        }
        store[index].receiveRating(rating);
        System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
    }

    public void listInventory() {
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-15s | %-15s | %-10s%n", "Video Name", "Checkout Status", "Rating");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s | %-15b | %-10d%n",
                    store[i].getName(), store[i].getCheckout(), store[i].getRating());
        }
        System.out.println("-----------------------------------------------------------");
    }
}

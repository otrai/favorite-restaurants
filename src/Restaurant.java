public class Restaurant {                         // Info about a restaurant
    // Internal fields
    private String name;
    private int rating;

    public void setName(String restaurantName) {   // Sets the restaurant's name
      name = restaurantName;
    }

    public void setRating(int userRating) {        // Sets the rating (1-5, with 5 best)
      rating = userRating;
    }

    public void print() {                          // Prints name and rating on one line
        System.out.println(name + " -- " + rating);
    }
}
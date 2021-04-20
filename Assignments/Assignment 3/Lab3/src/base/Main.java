void number_counter(int[] array, int target){
    if (array.length == 0){
        System.out.println("empty");
        return;
        }

    int counter = 0;
    fot (int number: array){
        if (target == number){
            counter++;
        }
    }
    System.out.println("There are " + counter + " " + target + "'s in the given array");
}

// int[] array = {1,2,3,4,5,6,1,2,3,4,1,2,2,4,1};
int[] array = {};
number_counter(array, 0);

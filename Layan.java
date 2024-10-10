//Layan Ali Alharbi 
//id: 443002742

// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element y in arr[]

            static int search(int arr[], int x, int y)

            {

                        for (int i = 0; i < x; i++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (arr[i] == y)

                                                return i;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] array = { 3, 4, 1, 7, 5 };

                        int x = array.length;

                        int y = 4;

                        int index = search(array, n, x);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//------------------------------------------------------------------------------------------------------
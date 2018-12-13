package code.otherAlgos;

//          Given length of wall w and shelves of two lengths m and n, find the number of each type of
//                  shelf to be used and the remaining empty space in the optimal solution so that the
//                  empty space is minimum. The larger of the two shelves is cheaper so it is preferred.
//                  However cost is secondary and first priority is to minimize empty space on wall.

public class Fitting_Shelves_Problem {


    public static void main(String[] args) {
        min_empty(24, 3, 5);
    }

    static void min_empty(int wall, int m, int n) {

        int min_n = 0;
        int min_m = 0;
        int empty = wall;

        int p = 0;
        int q = 0;
        int reminder;


        while (wall >= n) {

            q +=1;
            wall = wall - n;

            p = wall / m;

            reminder = wall % m;

            if (reminder <= empty) {
                min_m = p;
                min_n = q;
                empty = reminder;
            }
        }

        System.out.println("Minimum m::"+min_m);

        System.out.println("Minimum n::"+min_n);

        System.out.println("Minimum empty space  ::"+empty);
    }
}

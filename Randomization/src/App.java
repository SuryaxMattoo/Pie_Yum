//yummiestpie

//Write the highest yumminess rating of pies 
// Then clone the pies   
// Add the second pie to the party --> DO different types of pies for example
//Use loops to compare one pie to another

// Explain that the type is the string and the pyumminess is the float
// Index --> Where is it on the list 

// Find the max yumminess rating 

import java.util.ArrayList;

public class App{
    public static void main(String[] args) throws Exception {
        ArrayList<Pie> pies = new ArrayList<>();
        pies.add(new Pie(10.0, "Apple"));
        pies.add(new Pie(9.5, "Rhubarb"));
        pies.add(new Pie(3.5, "Blueberry"));
        pies.add(new Pie(6.5, "Pecan"));
        pies.add(new Pie(8.0, "Pecan"));
        cloneYummiestPie(pies);

        // Take the index of all the pies --> Read the pies and their number associated 
    }
        // pies will be [(10.0, "Apple"), (9.5, "Rhubarb"), 
        // (3.5, "Blueberry"), (10.0, "Apple"),
        // (6.5, "Pecan"), (10.0, "Apple")]
        

        //Below is the function for looping the list and checking which pies have the highest scores
        static void cloneYummiestPie(ArrayList<Pie> pies) {
            double pie_max = pies.get(0).yumminess;
            String pie_type = null; //Ahaan helped me with this part - I thought it was int 0 but it kept on giving me difficulties
            for (int i = 0; i < pies.size(); i++){
                pie_max = pies.get(i).yumminess;
                pie_type = pies.get(i).type;

            }
        }
//Once we have identified the highest rated pie we move on

        }
        
        pies.add(new Pie(pie_max, pie_type)); //This is used to add the second pie to the fiesta 
        //that everyone liked the most and tasted the yummiest



      
    }
}

//this section initializes the class of pies
class Pie{
    double yumminess;
    String type;
        
    Pie(double yumminess, String type) {
        this.yumminess = yumminess;
        this.type = type;
    }
}





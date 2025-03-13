package unit13;

import java.util.ArrayList;

public class Task 
{
    private String name;
    private int timeComplete;
        private static int amountTimeUsedUp = 0;
            private int MAX_TIME;
                                        private static ArrayList<Task> listofTasks;
                                        public Task(String name, int timeComplete, int MAX_TIME)
                                        {
                                            this.name = name;
                                            this.timeComplete = timeComplete;
                                        this.MAX_TIME = MAX_TIME;
                    listofTasks = new ArrayList<>();
                }
                public Boolean addTask(Task t)
                {
                    for(int x = 0; x < listofTasks.size(); x++)
                    {
                        if(listofTasks.get(x) == null)
                        {
                            listofTasks.add(t);
                            return true;
                        }
                    }
                    return false;
                }
                public int getTime()
                {
                    return timeComplete;
                }
                public String getName()
                {
                    return name;
                }
                public static String doTasks()
                {
                    Boolean timeUsedUp = false;
                    while(timeUsedUp != false)
                    {
                    for(int x = 0; x < listofTasks.size(); x++)
                        {
                            amountTimeUsedUp += timeComplete;
                            listofTasks.remove(x);
                    if(amountTimeUsedUp == MAX_TIME)
                    {
                        timeUsedUp = true;
                    }
            }
        }
        return "All time Used Up doing tasks";
    }
}

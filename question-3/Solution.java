public int moreHistoryThanMathAbsences() { 
    int count = 0;
    for (int i = 0; i<historyList.size(); i++) {
        CourseRecord student = historyList.get(i); 
        int numAbsences = student.getAbsences(); 
        String name = student.getStudentID(); 

        for(int j = 0; j < mathList.size(); j++) {
            CourseRecord studentTwo = mathList.get(j); 
            int numAbsencesTwo = studentTwo.getAbsences(); 
            String nameTwo = studentTwo.getStudentID();
            if ((nameTwo.equals(name))&&(numAbsences>numAbsencesTwo)) {
                count++; 
            }

        }       
    }
    return count;
}

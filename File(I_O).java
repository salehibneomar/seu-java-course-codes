File writer:

           winnerName = winnerNameInput.getText();
           winnerNameInput.setText("");
           winnerNameInput.setEditable(false);
           nameBtn.setEnabled(false);
           
           try{
               FileWriter fl = new FileWriter("records.txt", true);
               fl.write(winnerName+"    "+winnerChances.toString());
               fl.write(System.lineSeparator());
               fl.close();
               JOptionPane.showMessageDialog(this, "Name inserted successfully!");
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(this, "Error!");
           }



File reader:

        try{
            FileReader fl = new FileReader("records.txt");
            Scanner fetch = new Scanner(fl);
            while(fetch.hasNext()){
                playerRecord.setText("Previous winner: "+fetch.next()+",  Chances: "+fetch.next());
            }
            fl.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error!");
        }
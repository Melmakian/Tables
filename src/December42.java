public class December42 {
    public static void main(String[] args) {
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "DashboardTable";
            }

            @Override
            public String getTableName() {
                return "Amigo";
            }
        };
        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }
    public static class TableAdapter implements BTable{
        private ATable aTable;

        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return "["+aTable.getCurrentUserName()+"]"+" : "+aTable.getTableName();
        }
    }



}

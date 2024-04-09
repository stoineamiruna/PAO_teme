package model;

public enum Currency {
    RON("Romania", "RO"), EUR("Uniunea Europeana", "UE"), GPB("Regatul Unit", "UK"), TRY("Turcia", "TR"), USD("Statele Unite ale Americii", "USA");

    private final String numeTara;
    private final String simbolTara;
    Currency(String numeTara, String simbolTara) {
        this.numeTara = numeTara;
        this.simbolTara = simbolTara;
    }

    public String getNumeTara() {
        return numeTara;
    }
}

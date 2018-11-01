// ORM class for table 'product_transaction'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Nov 01 19:26:38 UTC 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class product_transaction extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("transaction_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        transaction_id = (Integer)value;
      }
    });
    setters.put("\u2002\u2002transaction_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        transaction_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("\u2002\u2002customer_ssn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_ssn = (String)value;
      }
    });
    setters.put("\u2002\u2002customer_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_name = (String)value;
      }
    });
    setters.put("\u2002\u2002customer_email", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_email = (String)value;
      }
    });
    setters.put("\u2002\u2002customer_adress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_adress = (String)value;
      }
    });
    setters.put("\u2002\u2002customer_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_state = (String)value;
      }
    });
    setters.put("\u2002\u2002customer_zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_zipcode = (String)value;
      }
    });
    setters.put("\u2002\u2002product_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_id = (Integer)value;
      }
    });
    setters.put("\u2002\u2002product_cantity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_cantity = (Integer)value;
      }
    });
  }
  public product_transaction() {
    init0();
  }
  private Integer transaction_id;
  public Integer get_transaction_id() {
    return transaction_id;
  }
  public void set_transaction_id(Integer transaction_id) {
    this.transaction_id = transaction_id;
  }
  public product_transaction with_transaction_id(Integer transaction_id) {
    this.transaction_id = transaction_id;
    return this;
  }
  private java.sql.Timestamp transaction_time;
  public java.sql.Timestamp get_transaction_time() {
    return transaction_time;
  }
  public void set_transaction_time(java.sql.Timestamp transaction_time) {
    this.transaction_time = transaction_time;
  }
  public product_transaction with_transaction_time(java.sql.Timestamp transaction_time) {
    this.transaction_time = transaction_time;
    return this;
  }
  private String customer_ssn;
  public String get_customer_ssn() {
    return customer_ssn;
  }
  public void set_customer_ssn(String customer_ssn) {
    this.customer_ssn = customer_ssn;
  }
  public product_transaction with_customer_ssn(String customer_ssn) {
    this.customer_ssn = customer_ssn;
    return this;
  }
  private String customer_name;
  public String get_customer_name() {
    return customer_name;
  }
  public void set_customer_name(String customer_name) {
    this.customer_name = customer_name;
  }
  public product_transaction with_customer_name(String customer_name) {
    this.customer_name = customer_name;
    return this;
  }
  private String customer_email;
  public String get_customer_email() {
    return customer_email;
  }
  public void set_customer_email(String customer_email) {
    this.customer_email = customer_email;
  }
  public product_transaction with_customer_email(String customer_email) {
    this.customer_email = customer_email;
    return this;
  }
  private String customer_adress;
  public String get_customer_adress() {
    return customer_adress;
  }
  public void set_customer_adress(String customer_adress) {
    this.customer_adress = customer_adress;
  }
  public product_transaction with_customer_adress(String customer_adress) {
    this.customer_adress = customer_adress;
    return this;
  }
  private String customer_state;
  public String get_customer_state() {
    return customer_state;
  }
  public void set_customer_state(String customer_state) {
    this.customer_state = customer_state;
  }
  public product_transaction with_customer_state(String customer_state) {
    this.customer_state = customer_state;
    return this;
  }
  private String customer_zipcode;
  public String get_customer_zipcode() {
    return customer_zipcode;
  }
  public void set_customer_zipcode(String customer_zipcode) {
    this.customer_zipcode = customer_zipcode;
  }
  public product_transaction with_customer_zipcode(String customer_zipcode) {
    this.customer_zipcode = customer_zipcode;
    return this;
  }
  private Integer product_id;
  public Integer get_product_id() {
    return product_id;
  }
  public void set_product_id(Integer product_id) {
    this.product_id = product_id;
  }
  public product_transaction with_product_id(Integer product_id) {
    this.product_id = product_id;
    return this;
  }
  private Integer product_cantity;
  public Integer get_product_cantity() {
    return product_cantity;
  }
  public void set_product_cantity(Integer product_cantity) {
    this.product_cantity = product_cantity;
  }
  public product_transaction with_product_cantity(Integer product_cantity) {
    this.product_cantity = product_cantity;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product_transaction)) {
      return false;
    }
    product_transaction that = (product_transaction) o;
    boolean equal = true;
    equal = equal && (this.transaction_id == null ? that.transaction_id == null : this.transaction_id.equals(that.transaction_id));
    equal = equal && (this.transaction_time == null ? that.transaction_time == null : this.transaction_time.equals(that.transaction_time));
    equal = equal && (this.customer_ssn == null ? that.customer_ssn == null : this.customer_ssn.equals(that.customer_ssn));
    equal = equal && (this.customer_name == null ? that.customer_name == null : this.customer_name.equals(that.customer_name));
    equal = equal && (this.customer_email == null ? that.customer_email == null : this.customer_email.equals(that.customer_email));
    equal = equal && (this.customer_adress == null ? that.customer_adress == null : this.customer_adress.equals(that.customer_adress));
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    equal = equal && (this.customer_zipcode == null ? that.customer_zipcode == null : this.customer_zipcode.equals(that.customer_zipcode));
    equal = equal && (this.product_id == null ? that.product_id == null : this.product_id.equals(that.product_id));
    equal = equal && (this.product_cantity == null ? that.product_cantity == null : this.product_cantity.equals(that.product_cantity));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof product_transaction)) {
      return false;
    }
    product_transaction that = (product_transaction) o;
    boolean equal = true;
    equal = equal && (this.transaction_id == null ? that.transaction_id == null : this.transaction_id.equals(that.transaction_id));
    equal = equal && (this.transaction_time == null ? that.transaction_time == null : this.transaction_time.equals(that.transaction_time));
    equal = equal && (this.customer_ssn == null ? that.customer_ssn == null : this.customer_ssn.equals(that.customer_ssn));
    equal = equal && (this.customer_name == null ? that.customer_name == null : this.customer_name.equals(that.customer_name));
    equal = equal && (this.customer_email == null ? that.customer_email == null : this.customer_email.equals(that.customer_email));
    equal = equal && (this.customer_adress == null ? that.customer_adress == null : this.customer_adress.equals(that.customer_adress));
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    equal = equal && (this.customer_zipcode == null ? that.customer_zipcode == null : this.customer_zipcode.equals(that.customer_zipcode));
    equal = equal && (this.product_id == null ? that.product_id == null : this.product_id.equals(that.product_id));
    equal = equal && (this.product_cantity == null ? that.product_cantity == null : this.product_cantity.equals(that.product_cantity));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.transaction_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.transaction_time = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.customer_ssn = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_name = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_email = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_adress = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_state = JdbcWritableBridge.readString(7, __dbResults);
    this.customer_zipcode = JdbcWritableBridge.readString(8, __dbResults);
    this.product_id = JdbcWritableBridge.readInteger(9, __dbResults);
    this.product_cantity = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.transaction_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.transaction_time = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.customer_ssn = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_name = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_email = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_adress = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_state = JdbcWritableBridge.readString(7, __dbResults);
    this.customer_zipcode = JdbcWritableBridge.readString(8, __dbResults);
    this.product_id = JdbcWritableBridge.readInteger(9, __dbResults);
    this.product_cantity = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(transaction_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(transaction_time, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(customer_ssn, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_email, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_adress, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_zipcode, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(product_id, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(product_cantity, 10 + __off, 4, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(transaction_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(transaction_time, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(customer_ssn, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_email, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_adress, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_zipcode, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(product_id, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(product_cantity, 10 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.transaction_id = null;
    } else {
    this.transaction_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.transaction_time = null;
    } else {
    this.transaction_time = new Timestamp(__dataIn.readLong());
    this.transaction_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_ssn = null;
    } else {
    this.customer_ssn = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_name = null;
    } else {
    this.customer_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_email = null;
    } else {
    this.customer_email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_adress = null;
    } else {
    this.customer_adress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_state = null;
    } else {
    this.customer_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_zipcode = null;
    } else {
    this.customer_zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_id = null;
    } else {
    this.product_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_cantity = null;
    } else {
    this.product_cantity = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.transaction_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.transaction_id);
    }
    if (null == this.transaction_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.transaction_time.getTime());
    __dataOut.writeInt(this.transaction_time.getNanos());
    }
    if (null == this.customer_ssn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_ssn);
    }
    if (null == this.customer_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_name);
    }
    if (null == this.customer_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_email);
    }
    if (null == this.customer_adress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_adress);
    }
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
    if (null == this.customer_zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_zipcode);
    }
    if (null == this.product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_id);
    }
    if (null == this.product_cantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_cantity);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.transaction_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.transaction_id);
    }
    if (null == this.transaction_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.transaction_time.getTime());
    __dataOut.writeInt(this.transaction_time.getNanos());
    }
    if (null == this.customer_ssn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_ssn);
    }
    if (null == this.customer_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_name);
    }
    if (null == this.customer_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_email);
    }
    if (null == this.customer_adress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_adress);
    }
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
    if (null == this.customer_zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_zipcode);
    }
    if (null == this.product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_id);
    }
    if (null == this.product_cantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_cantity);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(transaction_id==null?"null":"" + transaction_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transaction_time==null?"null":"" + transaction_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_ssn==null?"null":customer_ssn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_name==null?"null":customer_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_email==null?"null":customer_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_adress==null?"null":customer_adress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_state==null?"null":customer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_zipcode==null?"null":customer_zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_id==null?"null":"" + product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_cantity==null?"null":"" + product_cantity, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(transaction_id==null?"null":"" + transaction_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transaction_time==null?"null":"" + transaction_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_ssn==null?"null":customer_ssn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_name==null?"null":customer_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_email==null?"null":customer_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_adress==null?"null":customer_adress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_state==null?"null":customer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_zipcode==null?"null":customer_zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_id==null?"null":"" + product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_cantity==null?"null":"" + product_cantity, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.transaction_id = null; } else {
      this.transaction_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.transaction_time = null; } else {
      this.transaction_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_ssn = null; } else {
      this.customer_ssn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_name = null; } else {
      this.customer_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_email = null; } else {
      this.customer_email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_adress = null; } else {
      this.customer_adress = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_zipcode = null; } else {
      this.customer_zipcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_id = null; } else {
      this.product_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_cantity = null; } else {
      this.product_cantity = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.transaction_id = null; } else {
      this.transaction_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.transaction_time = null; } else {
      this.transaction_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_ssn = null; } else {
      this.customer_ssn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_name = null; } else {
      this.customer_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_email = null; } else {
      this.customer_email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_adress = null; } else {
      this.customer_adress = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_zipcode = null; } else {
      this.customer_zipcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_id = null; } else {
      this.product_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_cantity = null; } else {
      this.product_cantity = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    product_transaction o = (product_transaction) super.clone();
    o.transaction_time = (o.transaction_time != null) ? (java.sql.Timestamp) o.transaction_time.clone() : null;
    return o;
  }

  public void clone0(product_transaction o) throws CloneNotSupportedException {
    o.transaction_time = (o.transaction_time != null) ? (java.sql.Timestamp) o.transaction_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("transaction_id", this.transaction_id);
    __sqoop$field_map.put("\u2002\u2002transaction_time", this.transaction_time);
    __sqoop$field_map.put("\u2002\u2002customer_ssn", this.customer_ssn);
    __sqoop$field_map.put("\u2002\u2002customer_name", this.customer_name);
    __sqoop$field_map.put("\u2002\u2002customer_email", this.customer_email);
    __sqoop$field_map.put("\u2002\u2002customer_adress", this.customer_adress);
    __sqoop$field_map.put("\u2002\u2002customer_state", this.customer_state);
    __sqoop$field_map.put("\u2002\u2002customer_zipcode", this.customer_zipcode);
    __sqoop$field_map.put("\u2002\u2002product_id", this.product_id);
    __sqoop$field_map.put("\u2002\u2002product_cantity", this.product_cantity);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("transaction_id", this.transaction_id);
    __sqoop$field_map.put("\u2002\u2002transaction_time", this.transaction_time);
    __sqoop$field_map.put("\u2002\u2002customer_ssn", this.customer_ssn);
    __sqoop$field_map.put("\u2002\u2002customer_name", this.customer_name);
    __sqoop$field_map.put("\u2002\u2002customer_email", this.customer_email);
    __sqoop$field_map.put("\u2002\u2002customer_adress", this.customer_adress);
    __sqoop$field_map.put("\u2002\u2002customer_state", this.customer_state);
    __sqoop$field_map.put("\u2002\u2002customer_zipcode", this.customer_zipcode);
    __sqoop$field_map.put("\u2002\u2002product_id", this.product_id);
    __sqoop$field_map.put("\u2002\u2002product_cantity", this.product_cantity);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}

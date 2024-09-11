/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Student extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8162090531186310859L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Student\",\"namespace\":\"com.example.avro\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"secondName\",\"type\":\"string\"},{\"name\":\"age\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"course\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Student> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Student> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Student> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Student> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Student> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Student to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Student from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Student instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Student fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Long id;
  private java.lang.CharSequence name;
  private java.lang.CharSequence secondName;
  private java.lang.Integer age;
  private java.lang.Integer course;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Student() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param secondName The new value for secondName
   * @param age The new value for age
   * @param course The new value for course
   */
  public Student(java.lang.Long id, java.lang.CharSequence name, java.lang.CharSequence secondName, java.lang.Integer age, java.lang.Integer course) {
    this.id = id;
    this.name = name;
    this.secondName = secondName;
    this.age = age;
    this.course = course;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return secondName;
    case 3: return age;
    case 4: return course;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: secondName = (java.lang.CharSequence)value$; break;
    case 3: age = (java.lang.Integer)value$; break;
    case 4: course = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'secondName' field.
   * @return The value of the 'secondName' field.
   */
  public java.lang.CharSequence getSecondName() {
    return secondName;
  }


  /**
   * Sets the value of the 'secondName' field.
   * @param value the value to set.
   */
  public void setSecondName(java.lang.CharSequence value) {
    this.secondName = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }


  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'course' field.
   * @return The value of the 'course' field.
   */
  public java.lang.Integer getCourse() {
    return course;
  }


  /**
   * Sets the value of the 'course' field.
   * @param value the value to set.
   */
  public void setCourse(java.lang.Integer value) {
    this.course = value;
  }

  /**
   * Creates a new Student RecordBuilder.
   * @return A new Student RecordBuilder
   */
  public static com.example.avro.Student.Builder newBuilder() {
    return new com.example.avro.Student.Builder();
  }

  /**
   * Creates a new Student RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Student RecordBuilder
   */
  public static com.example.avro.Student.Builder newBuilder(com.example.avro.Student.Builder other) {
    if (other == null) {
      return new com.example.avro.Student.Builder();
    } else {
      return new com.example.avro.Student.Builder(other);
    }
  }

  /**
   * Creates a new Student RecordBuilder by copying an existing Student instance.
   * @param other The existing instance to copy.
   * @return A new Student RecordBuilder
   */
  public static com.example.avro.Student.Builder newBuilder(com.example.avro.Student other) {
    if (other == null) {
      return new com.example.avro.Student.Builder();
    } else {
      return new com.example.avro.Student.Builder(other);
    }
  }

  /**
   * RecordBuilder for Student instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Student>
    implements org.apache.avro.data.RecordBuilder<Student> {

    private java.lang.Long id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence secondName;
    private java.lang.Integer age;
    private java.lang.Integer course;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.avro.Student.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.secondName)) {
        this.secondName = data().deepCopy(fields()[2].schema(), other.secondName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.course)) {
        this.course = data().deepCopy(fields()[4].schema(), other.course);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Student instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.avro.Student other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.secondName)) {
        this.secondName = data().deepCopy(fields()[2].schema(), other.secondName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.course)) {
        this.course = data().deepCopy(fields()[4].schema(), other.course);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.example.avro.Student.Builder setId(java.lang.Long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.example.avro.Student.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.example.avro.Student.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.example.avro.Student.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'secondName' field.
      * @return The value.
      */
    public java.lang.CharSequence getSecondName() {
      return secondName;
    }


    /**
      * Sets the value of the 'secondName' field.
      * @param value The value of 'secondName'.
      * @return This builder.
      */
    public com.example.avro.Student.Builder setSecondName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.secondName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'secondName' field has been set.
      * @return True if the 'secondName' field has been set, false otherwise.
      */
    public boolean hasSecondName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'secondName' field.
      * @return This builder.
      */
    public com.example.avro.Student.Builder clearSecondName() {
      secondName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }


    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.example.avro.Student.Builder setAge(java.lang.Integer value) {
      validate(fields()[3], value);
      this.age = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.example.avro.Student.Builder clearAge() {
      age = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'course' field.
      * @return The value.
      */
    public java.lang.Integer getCourse() {
      return course;
    }


    /**
      * Sets the value of the 'course' field.
      * @param value The value of 'course'.
      * @return This builder.
      */
    public com.example.avro.Student.Builder setCourse(java.lang.Integer value) {
      validate(fields()[4], value);
      this.course = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'course' field has been set.
      * @return True if the 'course' field has been set, false otherwise.
      */
    public boolean hasCourse() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'course' field.
      * @return This builder.
      */
    public com.example.avro.Student.Builder clearCourse() {
      course = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Student build() {
      try {
        Student record = new Student();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.secondName = fieldSetFlags()[2] ? this.secondName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.age = fieldSetFlags()[3] ? this.age : (java.lang.Integer) defaultValue(fields()[3]);
        record.course = fieldSetFlags()[4] ? this.course : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Student>
    WRITER$ = (org.apache.avro.io.DatumWriter<Student>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Student>
    READER$ = (org.apache.avro.io.DatumReader<Student>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.id);
    }

    out.writeString(this.name);

    out.writeString(this.secondName);

    if (this.age == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.age);
    }

    if (this.course == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.course);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readLong();
      }

      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.secondName = in.readString(this.secondName instanceof Utf8 ? (Utf8)this.secondName : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.age = null;
      } else {
        this.age = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.course = null;
      } else {
        this.course = in.readInt();
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readLong();
          }
          break;

        case 1:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 2:
          this.secondName = in.readString(this.secondName instanceof Utf8 ? (Utf8)this.secondName : null);
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.age = null;
          } else {
            this.age = in.readInt();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.course = null;
          } else {
            this.course = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











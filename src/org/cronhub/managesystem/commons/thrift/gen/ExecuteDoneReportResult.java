package org.cronhub.managesystem.commons.thrift.gen;
/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExecuteDoneReportResult implements org.apache.thrift.TBase<ExecuteDoneReportResult, ExecuteDoneReportResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExecuteDoneReportResult");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("task_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField REAL_CMD_FIELD_DESC = new org.apache.thrift.protocol.TField("real_cmd", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COMPLETE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("complete_status", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField START_DATETIME_FIELD_DESC = new org.apache.thrift.protocol.TField("start_datetime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField END_DATETIME_FIELD_DESC = new org.apache.thrift.protocol.TField("end_datetime", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField EXEC_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("exec_type", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField EXEC_RETURN_STR_FIELD_DESC = new org.apache.thrift.protocol.TField("exec_return_str", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField TASK_RECORD_UNDO_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("task_record_undo_id", org.apache.thrift.protocol.TType.I64, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExecuteDoneReportResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExecuteDoneReportResultTupleSchemeFactory());
  }

  public long task_id; // required
  public String real_cmd; // required
  public int complete_status; // required
  public boolean success; // required
  public long start_datetime; // required
  public long end_datetime; // required
  public int exec_type; // required
  public String exec_return_str; // required
  public long task_record_undo_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "task_id"),
    REAL_CMD((short)2, "real_cmd"),
    COMPLETE_STATUS((short)3, "complete_status"),
    SUCCESS((short)4, "success"),
    START_DATETIME((short)5, "start_datetime"),
    END_DATETIME((short)6, "end_datetime"),
    EXEC_TYPE((short)7, "exec_type"),
    EXEC_RETURN_STR((short)8, "exec_return_str"),
    TASK_RECORD_UNDO_ID((short)9, "task_record_undo_id");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // REAL_CMD
          return REAL_CMD;
        case 3: // COMPLETE_STATUS
          return COMPLETE_STATUS;
        case 4: // SUCCESS
          return SUCCESS;
        case 5: // START_DATETIME
          return START_DATETIME;
        case 6: // END_DATETIME
          return END_DATETIME;
        case 7: // EXEC_TYPE
          return EXEC_TYPE;
        case 8: // EXEC_RETURN_STR
          return EXEC_RETURN_STR;
        case 9: // TASK_RECORD_UNDO_ID
          return TASK_RECORD_UNDO_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TASK_ID_ISSET_ID = 0;
  private static final int __COMPLETE_STATUS_ISSET_ID = 1;
  private static final int __SUCCESS_ISSET_ID = 2;
  private static final int __START_DATETIME_ISSET_ID = 3;
  private static final int __END_DATETIME_ISSET_ID = 4;
  private static final int __EXEC_TYPE_ISSET_ID = 5;
  private static final int __TASK_RECORD_UNDO_ID_ISSET_ID = 6;
  private BitSet __isset_bit_vector = new BitSet(7);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("task_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REAL_CMD, new org.apache.thrift.meta_data.FieldMetaData("real_cmd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPLETE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("complete_status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.START_DATETIME, new org.apache.thrift.meta_data.FieldMetaData("start_datetime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_DATETIME, new org.apache.thrift.meta_data.FieldMetaData("end_datetime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXEC_TYPE, new org.apache.thrift.meta_data.FieldMetaData("exec_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXEC_RETURN_STR, new org.apache.thrift.meta_data.FieldMetaData("exec_return_str", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TASK_RECORD_UNDO_ID, new org.apache.thrift.meta_data.FieldMetaData("task_record_undo_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExecuteDoneReportResult.class, metaDataMap);
  }

  public ExecuteDoneReportResult() {
  }

  public ExecuteDoneReportResult(
    long task_id,
    String real_cmd,
    int complete_status,
    boolean success,
    long start_datetime,
    long end_datetime,
    int exec_type,
    String exec_return_str,
    long task_record_undo_id)
  {
    this();
    this.task_id = task_id;
    setTask_idIsSet(true);
    this.real_cmd = real_cmd;
    this.complete_status = complete_status;
    setComplete_statusIsSet(true);
    this.success = success;
    setSuccessIsSet(true);
    this.start_datetime = start_datetime;
    setStart_datetimeIsSet(true);
    this.end_datetime = end_datetime;
    setEnd_datetimeIsSet(true);
    this.exec_type = exec_type;
    setExec_typeIsSet(true);
    this.exec_return_str = exec_return_str;
    this.task_record_undo_id = task_record_undo_id;
    setTask_record_undo_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecuteDoneReportResult(ExecuteDoneReportResult other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.task_id = other.task_id;
    if (other.isSetReal_cmd()) {
      this.real_cmd = other.real_cmd;
    }
    this.complete_status = other.complete_status;
    this.success = other.success;
    this.start_datetime = other.start_datetime;
    this.end_datetime = other.end_datetime;
    this.exec_type = other.exec_type;
    if (other.isSetExec_return_str()) {
      this.exec_return_str = other.exec_return_str;
    }
    this.task_record_undo_id = other.task_record_undo_id;
  }

  public ExecuteDoneReportResult deepCopy() {
    return new ExecuteDoneReportResult(this);
  }

  @Override
  public void clear() {
    setTask_idIsSet(false);
    this.task_id = 0;
    this.real_cmd = null;
    setComplete_statusIsSet(false);
    this.complete_status = 0;
    setSuccessIsSet(false);
    this.success = false;
    setStart_datetimeIsSet(false);
    this.start_datetime = 0;
    setEnd_datetimeIsSet(false);
    this.end_datetime = 0;
    setExec_typeIsSet(false);
    this.exec_type = 0;
    this.exec_return_str = null;
    setTask_record_undo_idIsSet(false);
    this.task_record_undo_id = 0;
  }

  public long getTask_id() {
    return this.task_id;
  }

  public ExecuteDoneReportResult setTask_id(long task_id) {
    this.task_id = task_id;
    setTask_idIsSet(true);
    return this;
  }

  public void unsetTask_id() {
    __isset_bit_vector.clear(__TASK_ID_ISSET_ID);
  }

  /** Returns true if field task_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTask_id() {
    return __isset_bit_vector.get(__TASK_ID_ISSET_ID);
  }

  public void setTask_idIsSet(boolean value) {
    __isset_bit_vector.set(__TASK_ID_ISSET_ID, value);
  }

  public String getReal_cmd() {
    return this.real_cmd;
  }

  public ExecuteDoneReportResult setReal_cmd(String real_cmd) {
    this.real_cmd = real_cmd;
    return this;
  }

  public void unsetReal_cmd() {
    this.real_cmd = null;
  }

  /** Returns true if field real_cmd is set (has been assigned a value) and false otherwise */
  public boolean isSetReal_cmd() {
    return this.real_cmd != null;
  }

  public void setReal_cmdIsSet(boolean value) {
    if (!value) {
      this.real_cmd = null;
    }
  }

  public int getComplete_status() {
    return this.complete_status;
  }

  public ExecuteDoneReportResult setComplete_status(int complete_status) {
    this.complete_status = complete_status;
    setComplete_statusIsSet(true);
    return this;
  }

  public void unsetComplete_status() {
    __isset_bit_vector.clear(__COMPLETE_STATUS_ISSET_ID);
  }

  /** Returns true if field complete_status is set (has been assigned a value) and false otherwise */
  public boolean isSetComplete_status() {
    return __isset_bit_vector.get(__COMPLETE_STATUS_ISSET_ID);
  }

  public void setComplete_statusIsSet(boolean value) {
    __isset_bit_vector.set(__COMPLETE_STATUS_ISSET_ID, value);
  }

  public boolean isSuccess() {
    return this.success;
  }

  public ExecuteDoneReportResult setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bit_vector.clear(__SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return __isset_bit_vector.get(__SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bit_vector.set(__SUCCESS_ISSET_ID, value);
  }

  public long getStart_datetime() {
    return this.start_datetime;
  }

  public ExecuteDoneReportResult setStart_datetime(long start_datetime) {
    this.start_datetime = start_datetime;
    setStart_datetimeIsSet(true);
    return this;
  }

  public void unsetStart_datetime() {
    __isset_bit_vector.clear(__START_DATETIME_ISSET_ID);
  }

  /** Returns true if field start_datetime is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_datetime() {
    return __isset_bit_vector.get(__START_DATETIME_ISSET_ID);
  }

  public void setStart_datetimeIsSet(boolean value) {
    __isset_bit_vector.set(__START_DATETIME_ISSET_ID, value);
  }

  public long getEnd_datetime() {
    return this.end_datetime;
  }

  public ExecuteDoneReportResult setEnd_datetime(long end_datetime) {
    this.end_datetime = end_datetime;
    setEnd_datetimeIsSet(true);
    return this;
  }

  public void unsetEnd_datetime() {
    __isset_bit_vector.clear(__END_DATETIME_ISSET_ID);
  }

  /** Returns true if field end_datetime is set (has been assigned a value) and false otherwise */
  public boolean isSetEnd_datetime() {
    return __isset_bit_vector.get(__END_DATETIME_ISSET_ID);
  }

  public void setEnd_datetimeIsSet(boolean value) {
    __isset_bit_vector.set(__END_DATETIME_ISSET_ID, value);
  }

  public int getExec_type() {
    return this.exec_type;
  }

  public ExecuteDoneReportResult setExec_type(int exec_type) {
    this.exec_type = exec_type;
    setExec_typeIsSet(true);
    return this;
  }

  public void unsetExec_type() {
    __isset_bit_vector.clear(__EXEC_TYPE_ISSET_ID);
  }

  /** Returns true if field exec_type is set (has been assigned a value) and false otherwise */
  public boolean isSetExec_type() {
    return __isset_bit_vector.get(__EXEC_TYPE_ISSET_ID);
  }

  public void setExec_typeIsSet(boolean value) {
    __isset_bit_vector.set(__EXEC_TYPE_ISSET_ID, value);
  }

  public String getExec_return_str() {
    return this.exec_return_str;
  }

  public ExecuteDoneReportResult setExec_return_str(String exec_return_str) {
    this.exec_return_str = exec_return_str;
    return this;
  }

  public void unsetExec_return_str() {
    this.exec_return_str = null;
  }

  /** Returns true if field exec_return_str is set (has been assigned a value) and false otherwise */
  public boolean isSetExec_return_str() {
    return this.exec_return_str != null;
  }

  public void setExec_return_strIsSet(boolean value) {
    if (!value) {
      this.exec_return_str = null;
    }
  }

  public long getTask_record_undo_id() {
    return this.task_record_undo_id;
  }

  public ExecuteDoneReportResult setTask_record_undo_id(long task_record_undo_id) {
    this.task_record_undo_id = task_record_undo_id;
    setTask_record_undo_idIsSet(true);
    return this;
  }

  public void unsetTask_record_undo_id() {
    __isset_bit_vector.clear(__TASK_RECORD_UNDO_ID_ISSET_ID);
  }

  /** Returns true if field task_record_undo_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTask_record_undo_id() {
    return __isset_bit_vector.get(__TASK_RECORD_UNDO_ID_ISSET_ID);
  }

  public void setTask_record_undo_idIsSet(boolean value) {
    __isset_bit_vector.set(__TASK_RECORD_UNDO_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTask_id();
      } else {
        setTask_id((Long)value);
      }
      break;

    case REAL_CMD:
      if (value == null) {
        unsetReal_cmd();
      } else {
        setReal_cmd((String)value);
      }
      break;

    case COMPLETE_STATUS:
      if (value == null) {
        unsetComplete_status();
      } else {
        setComplete_status((Integer)value);
      }
      break;

    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Boolean)value);
      }
      break;

    case START_DATETIME:
      if (value == null) {
        unsetStart_datetime();
      } else {
        setStart_datetime((Long)value);
      }
      break;

    case END_DATETIME:
      if (value == null) {
        unsetEnd_datetime();
      } else {
        setEnd_datetime((Long)value);
      }
      break;

    case EXEC_TYPE:
      if (value == null) {
        unsetExec_type();
      } else {
        setExec_type((Integer)value);
      }
      break;

    case EXEC_RETURN_STR:
      if (value == null) {
        unsetExec_return_str();
      } else {
        setExec_return_str((String)value);
      }
      break;

    case TASK_RECORD_UNDO_ID:
      if (value == null) {
        unsetTask_record_undo_id();
      } else {
        setTask_record_undo_id((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return Long.valueOf(getTask_id());

    case REAL_CMD:
      return getReal_cmd();

    case COMPLETE_STATUS:
      return Integer.valueOf(getComplete_status());

    case SUCCESS:
      return Boolean.valueOf(isSuccess());

    case START_DATETIME:
      return Long.valueOf(getStart_datetime());

    case END_DATETIME:
      return Long.valueOf(getEnd_datetime());

    case EXEC_TYPE:
      return Integer.valueOf(getExec_type());

    case EXEC_RETURN_STR:
      return getExec_return_str();

    case TASK_RECORD_UNDO_ID:
      return Long.valueOf(getTask_record_undo_id());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTask_id();
    case REAL_CMD:
      return isSetReal_cmd();
    case COMPLETE_STATUS:
      return isSetComplete_status();
    case SUCCESS:
      return isSetSuccess();
    case START_DATETIME:
      return isSetStart_datetime();
    case END_DATETIME:
      return isSetEnd_datetime();
    case EXEC_TYPE:
      return isSetExec_type();
    case EXEC_RETURN_STR:
      return isSetExec_return_str();
    case TASK_RECORD_UNDO_ID:
      return isSetTask_record_undo_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecuteDoneReportResult)
      return this.equals((ExecuteDoneReportResult)that);
    return false;
  }

  public boolean equals(ExecuteDoneReportResult that) {
    if (that == null)
      return false;

    boolean this_present_task_id = true;
    boolean that_present_task_id = true;
    if (this_present_task_id || that_present_task_id) {
      if (!(this_present_task_id && that_present_task_id))
        return false;
      if (this.task_id != that.task_id)
        return false;
    }

    boolean this_present_real_cmd = true && this.isSetReal_cmd();
    boolean that_present_real_cmd = true && that.isSetReal_cmd();
    if (this_present_real_cmd || that_present_real_cmd) {
      if (!(this_present_real_cmd && that_present_real_cmd))
        return false;
      if (!this.real_cmd.equals(that.real_cmd))
        return false;
    }

    boolean this_present_complete_status = true;
    boolean that_present_complete_status = true;
    if (this_present_complete_status || that_present_complete_status) {
      if (!(this_present_complete_status && that_present_complete_status))
        return false;
      if (this.complete_status != that.complete_status)
        return false;
    }

    boolean this_present_success = true;
    boolean that_present_success = true;
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_start_datetime = true;
    boolean that_present_start_datetime = true;
    if (this_present_start_datetime || that_present_start_datetime) {
      if (!(this_present_start_datetime && that_present_start_datetime))
        return false;
      if (this.start_datetime != that.start_datetime)
        return false;
    }

    boolean this_present_end_datetime = true;
    boolean that_present_end_datetime = true;
    if (this_present_end_datetime || that_present_end_datetime) {
      if (!(this_present_end_datetime && that_present_end_datetime))
        return false;
      if (this.end_datetime != that.end_datetime)
        return false;
    }

    boolean this_present_exec_type = true;
    boolean that_present_exec_type = true;
    if (this_present_exec_type || that_present_exec_type) {
      if (!(this_present_exec_type && that_present_exec_type))
        return false;
      if (this.exec_type != that.exec_type)
        return false;
    }

    boolean this_present_exec_return_str = true && this.isSetExec_return_str();
    boolean that_present_exec_return_str = true && that.isSetExec_return_str();
    if (this_present_exec_return_str || that_present_exec_return_str) {
      if (!(this_present_exec_return_str && that_present_exec_return_str))
        return false;
      if (!this.exec_return_str.equals(that.exec_return_str))
        return false;
    }

    boolean this_present_task_record_undo_id = true;
    boolean that_present_task_record_undo_id = true;
    if (this_present_task_record_undo_id || that_present_task_record_undo_id) {
      if (!(this_present_task_record_undo_id && that_present_task_record_undo_id))
        return false;
      if (this.task_record_undo_id != that.task_record_undo_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ExecuteDoneReportResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ExecuteDoneReportResult typedOther = (ExecuteDoneReportResult)other;

    lastComparison = Boolean.valueOf(isSetTask_id()).compareTo(typedOther.isSetTask_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTask_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task_id, typedOther.task_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReal_cmd()).compareTo(typedOther.isSetReal_cmd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReal_cmd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.real_cmd, typedOther.real_cmd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComplete_status()).compareTo(typedOther.isSetComplete_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComplete_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.complete_status, typedOther.complete_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(typedOther.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, typedOther.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart_datetime()).compareTo(typedOther.isSetStart_datetime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_datetime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_datetime, typedOther.start_datetime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnd_datetime()).compareTo(typedOther.isSetEnd_datetime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnd_datetime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.end_datetime, typedOther.end_datetime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExec_type()).compareTo(typedOther.isSetExec_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExec_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exec_type, typedOther.exec_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExec_return_str()).compareTo(typedOther.isSetExec_return_str());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExec_return_str()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exec_return_str, typedOther.exec_return_str);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTask_record_undo_id()).compareTo(typedOther.isSetTask_record_undo_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTask_record_undo_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task_record_undo_id, typedOther.task_record_undo_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExecuteDoneReportResult(");
    boolean first = true;

    sb.append("task_id:");
    sb.append(this.task_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("real_cmd:");
    if (this.real_cmd == null) {
      sb.append("null");
    } else {
      sb.append(this.real_cmd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("complete_status:");
    sb.append(this.complete_status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("success:");
    sb.append(this.success);
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_datetime:");
    sb.append(this.start_datetime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("end_datetime:");
    sb.append(this.end_datetime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exec_type:");
    sb.append(this.exec_type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exec_return_str:");
    if (this.exec_return_str == null) {
      sb.append("null");
    } else {
      sb.append(this.exec_return_str);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("task_record_undo_id:");
    sb.append(this.task_record_undo_id);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExecuteDoneReportResultStandardSchemeFactory implements SchemeFactory {
    public ExecuteDoneReportResultStandardScheme getScheme() {
      return new ExecuteDoneReportResultStandardScheme();
    }
  }

  private static class ExecuteDoneReportResultStandardScheme extends StandardScheme<ExecuteDoneReportResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExecuteDoneReportResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.task_id = iprot.readI64();
              struct.setTask_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REAL_CMD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.real_cmd = iprot.readString();
              struct.setReal_cmdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPLETE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.complete_status = iprot.readI32();
              struct.setComplete_statusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // START_DATETIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start_datetime = iprot.readI64();
              struct.setStart_datetimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // END_DATETIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.end_datetime = iprot.readI64();
              struct.setEnd_datetimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // EXEC_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.exec_type = iprot.readI32();
              struct.setExec_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // EXEC_RETURN_STR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exec_return_str = iprot.readString();
              struct.setExec_return_strIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // TASK_RECORD_UNDO_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.task_record_undo_id = iprot.readI64();
              struct.setTask_record_undo_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExecuteDoneReportResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
      oprot.writeI64(struct.task_id);
      oprot.writeFieldEnd();
      if (struct.real_cmd != null) {
        oprot.writeFieldBegin(REAL_CMD_FIELD_DESC);
        oprot.writeString(struct.real_cmd);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COMPLETE_STATUS_FIELD_DESC);
      oprot.writeI32(struct.complete_status);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.success);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_DATETIME_FIELD_DESC);
      oprot.writeI64(struct.start_datetime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_DATETIME_FIELD_DESC);
      oprot.writeI64(struct.end_datetime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EXEC_TYPE_FIELD_DESC);
      oprot.writeI32(struct.exec_type);
      oprot.writeFieldEnd();
      if (struct.exec_return_str != null) {
        oprot.writeFieldBegin(EXEC_RETURN_STR_FIELD_DESC);
        oprot.writeString(struct.exec_return_str);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TASK_RECORD_UNDO_ID_FIELD_DESC);
      oprot.writeI64(struct.task_record_undo_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExecuteDoneReportResultTupleSchemeFactory implements SchemeFactory {
    public ExecuteDoneReportResultTupleScheme getScheme() {
      return new ExecuteDoneReportResultTupleScheme();
    }
  }

  private static class ExecuteDoneReportResultTupleScheme extends TupleScheme<ExecuteDoneReportResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExecuteDoneReportResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTask_id()) {
        optionals.set(0);
      }
      if (struct.isSetReal_cmd()) {
        optionals.set(1);
      }
      if (struct.isSetComplete_status()) {
        optionals.set(2);
      }
      if (struct.isSetSuccess()) {
        optionals.set(3);
      }
      if (struct.isSetStart_datetime()) {
        optionals.set(4);
      }
      if (struct.isSetEnd_datetime()) {
        optionals.set(5);
      }
      if (struct.isSetExec_type()) {
        optionals.set(6);
      }
      if (struct.isSetExec_return_str()) {
        optionals.set(7);
      }
      if (struct.isSetTask_record_undo_id()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetTask_id()) {
        oprot.writeI64(struct.task_id);
      }
      if (struct.isSetReal_cmd()) {
        oprot.writeString(struct.real_cmd);
      }
      if (struct.isSetComplete_status()) {
        oprot.writeI32(struct.complete_status);
      }
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
      if (struct.isSetStart_datetime()) {
        oprot.writeI64(struct.start_datetime);
      }
      if (struct.isSetEnd_datetime()) {
        oprot.writeI64(struct.end_datetime);
      }
      if (struct.isSetExec_type()) {
        oprot.writeI32(struct.exec_type);
      }
      if (struct.isSetExec_return_str()) {
        oprot.writeString(struct.exec_return_str);
      }
      if (struct.isSetTask_record_undo_id()) {
        oprot.writeI64(struct.task_record_undo_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExecuteDoneReportResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.task_id = iprot.readI64();
        struct.setTask_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.real_cmd = iprot.readString();
        struct.setReal_cmdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.complete_status = iprot.readI32();
        struct.setComplete_statusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(4)) {
        struct.start_datetime = iprot.readI64();
        struct.setStart_datetimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.end_datetime = iprot.readI64();
        struct.setEnd_datetimeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.exec_type = iprot.readI32();
        struct.setExec_typeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.exec_return_str = iprot.readString();
        struct.setExec_return_strIsSet(true);
      }
      if (incoming.get(8)) {
        struct.task_record_undo_id = iprot.readI64();
        struct.setTask_record_undo_idIsSet(true);
      }
    }
  }

}


package eu.morningbird.careforplants.model;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("unchecked")
public class PlantDao_Impl implements PlantDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPlant;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PlantDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlant = new EntityInsertionAdapter<Plant>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `plant`(`id`,`name`,`location`,`note`,`color`,`has_photo`,`image_path`,`icon`,`is_time_periodic`,`time_period`,`watering_period`,`period_start_date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Plant value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLocation());
        }
        if (value.getNote() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNote());
        }
        stmt.bindLong(5, value.getColor());
        final int _tmp;
        _tmp = value.getHasPhoto() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        if (value.getImagePath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getImagePath());
        }
        stmt.bindLong(8, value.getIcon());
        final int _tmp_1;
        _tmp_1 = value.isTimePeriodic() ? 1 : 0;
        stmt.bindLong(9, _tmp_1);
        stmt.bindLong(10, value.getTimePeriod());
        stmt.bindLong(11, value.getWateringPeriod());
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getPeriodStartDate());
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_2);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from plant";
        return _query;
      }
    };
  }

  @Override
  public void insert(Plant plant) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPlant.insert(plant);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<Plant> getAll() {
    final String _sql = "SELECT * from plant";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
      final int _cursorIndexOfNote = _cursor.getColumnIndexOrThrow("note");
      final int _cursorIndexOfColor = _cursor.getColumnIndexOrThrow("color");
      final int _cursorIndexOfHasPhoto = _cursor.getColumnIndexOrThrow("has_photo");
      final int _cursorIndexOfImagePath = _cursor.getColumnIndexOrThrow("image_path");
      final int _cursorIndexOfIcon = _cursor.getColumnIndexOrThrow("icon");
      final int _cursorIndexOfIsTimePeriodic = _cursor.getColumnIndexOrThrow("is_time_periodic");
      final int _cursorIndexOfTimePeriod = _cursor.getColumnIndexOrThrow("time_period");
      final int _cursorIndexOfWateringPeriod = _cursor.getColumnIndexOrThrow("watering_period");
      final int _cursorIndexOfPeriodStartDate = _cursor.getColumnIndexOrThrow("period_start_date");
      final List<Plant> _result = new ArrayList<Plant>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Plant _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpLocation;
        _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
        final String _tmpNote;
        _tmpNote = _cursor.getString(_cursorIndexOfNote);
        final int _tmpColor;
        _tmpColor = _cursor.getInt(_cursorIndexOfColor);
        final boolean _tmpHasPhoto;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfHasPhoto);
        _tmpHasPhoto = _tmp != 0;
        final String _tmpImagePath;
        _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
        final int _tmpIcon;
        _tmpIcon = _cursor.getInt(_cursorIndexOfIcon);
        final boolean _tmpIsTimePeriodic;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsTimePeriodic);
        _tmpIsTimePeriodic = _tmp_1 != 0;
        final int _tmpTimePeriod;
        _tmpTimePeriod = _cursor.getInt(_cursorIndexOfTimePeriod);
        final int _tmpWateringPeriod;
        _tmpWateringPeriod = _cursor.getInt(_cursorIndexOfWateringPeriod);
        final Date _tmpPeriodStartDate;
        final Long _tmp_2;
        if (_cursor.isNull(_cursorIndexOfPeriodStartDate)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getLong(_cursorIndexOfPeriodStartDate);
        }
        _tmpPeriodStartDate = __converters.fromTimestamp(_tmp_2);
        _item = new Plant(_tmpId,_tmpName,_tmpLocation,_tmpNote,_tmpColor,_tmpHasPhoto,_tmpImagePath,_tmpIcon,_tmpIsTimePeriodic,_tmpTimePeriod,_tmpWateringPeriod,_tmpPeriodStartDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Plant> loadSingle(long id) {
    final String _sql = "SELECT * from plant WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
      final int _cursorIndexOfNote = _cursor.getColumnIndexOrThrow("note");
      final int _cursorIndexOfColor = _cursor.getColumnIndexOrThrow("color");
      final int _cursorIndexOfHasPhoto = _cursor.getColumnIndexOrThrow("has_photo");
      final int _cursorIndexOfImagePath = _cursor.getColumnIndexOrThrow("image_path");
      final int _cursorIndexOfIcon = _cursor.getColumnIndexOrThrow("icon");
      final int _cursorIndexOfIsTimePeriodic = _cursor.getColumnIndexOrThrow("is_time_periodic");
      final int _cursorIndexOfTimePeriod = _cursor.getColumnIndexOrThrow("time_period");
      final int _cursorIndexOfWateringPeriod = _cursor.getColumnIndexOrThrow("watering_period");
      final int _cursorIndexOfPeriodStartDate = _cursor.getColumnIndexOrThrow("period_start_date");
      final List<Plant> _result = new ArrayList<Plant>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Plant _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpLocation;
        _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
        final String _tmpNote;
        _tmpNote = _cursor.getString(_cursorIndexOfNote);
        final int _tmpColor;
        _tmpColor = _cursor.getInt(_cursorIndexOfColor);
        final boolean _tmpHasPhoto;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfHasPhoto);
        _tmpHasPhoto = _tmp != 0;
        final String _tmpImagePath;
        _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
        final int _tmpIcon;
        _tmpIcon = _cursor.getInt(_cursorIndexOfIcon);
        final boolean _tmpIsTimePeriodic;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsTimePeriodic);
        _tmpIsTimePeriodic = _tmp_1 != 0;
        final int _tmpTimePeriod;
        _tmpTimePeriod = _cursor.getInt(_cursorIndexOfTimePeriod);
        final int _tmpWateringPeriod;
        _tmpWateringPeriod = _cursor.getInt(_cursorIndexOfWateringPeriod);
        final Date _tmpPeriodStartDate;
        final Long _tmp_2;
        if (_cursor.isNull(_cursorIndexOfPeriodStartDate)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getLong(_cursorIndexOfPeriodStartDate);
        }
        _tmpPeriodStartDate = __converters.fromTimestamp(_tmp_2);
        _item = new Plant(_tmpId,_tmpName,_tmpLocation,_tmpNote,_tmpColor,_tmpHasPhoto,_tmpImagePath,_tmpIcon,_tmpIsTimePeriodic,_tmpTimePeriod,_tmpWateringPeriod,_tmpPeriodStartDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}

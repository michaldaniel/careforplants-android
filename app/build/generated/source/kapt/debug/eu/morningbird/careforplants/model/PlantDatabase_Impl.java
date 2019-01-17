package eu.morningbird.careforplants.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class PlantDatabase_Impl extends PlantDatabase {
  private volatile PlantDao _plantDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `plant` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `location` TEXT NOT NULL, `note` TEXT NOT NULL, `color` INTEGER NOT NULL, `has_photo` INTEGER NOT NULL, `image_path` TEXT NOT NULL, `icon` INTEGER NOT NULL, `is_time_periodic` INTEGER NOT NULL, `time_period` INTEGER NOT NULL, `watering_period` INTEGER NOT NULL, `period_start_date` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"aa9132d8b1c029f51716cfa0cad7e51e\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `plant`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPlant = new HashMap<String, TableInfo.Column>(12);
        _columnsPlant.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsPlant.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsPlant.put("location", new TableInfo.Column("location", "TEXT", true, 0));
        _columnsPlant.put("note", new TableInfo.Column("note", "TEXT", true, 0));
        _columnsPlant.put("color", new TableInfo.Column("color", "INTEGER", true, 0));
        _columnsPlant.put("has_photo", new TableInfo.Column("has_photo", "INTEGER", true, 0));
        _columnsPlant.put("image_path", new TableInfo.Column("image_path", "TEXT", true, 0));
        _columnsPlant.put("icon", new TableInfo.Column("icon", "INTEGER", true, 0));
        _columnsPlant.put("is_time_periodic", new TableInfo.Column("is_time_periodic", "INTEGER", true, 0));
        _columnsPlant.put("time_period", new TableInfo.Column("time_period", "INTEGER", true, 0));
        _columnsPlant.put("watering_period", new TableInfo.Column("watering_period", "INTEGER", true, 0));
        _columnsPlant.put("period_start_date", new TableInfo.Column("period_start_date", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlant = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlant = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlant = new TableInfo("plant", _columnsPlant, _foreignKeysPlant, _indicesPlant);
        final TableInfo _existingPlant = TableInfo.read(_db, "plant");
        if (! _infoPlant.equals(_existingPlant)) {
          throw new IllegalStateException("Migration didn't properly handle plant(eu.morningbird.careforplants.model.Plant).\n"
                  + " Expected:\n" + _infoPlant + "\n"
                  + " Found:\n" + _existingPlant);
        }
      }
    }, "aa9132d8b1c029f51716cfa0cad7e51e", "d2635d744415f125c506bdb8ca5b1967");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "plant");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `plant`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PlantDao plantDao() {
    if (_plantDao != null) {
      return _plantDao;
    } else {
      synchronized(this) {
        if(_plantDao == null) {
          _plantDao = new PlantDao_Impl(this);
        }
        return _plantDao;
      }
    }
  }
}

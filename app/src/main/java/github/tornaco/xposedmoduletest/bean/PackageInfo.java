package github.tornaco.xposedmoduletest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import github.tornaco.xposedmoduletest.xposed.util.PkgUtil;
import org.greenrobot.greendao.annotation.Transient;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "PACKAGE_INFO".
 */
@Entity
public class PackageInfo {

    @Id
    private Integer id;
    private String pkgName;
    private String appName;
    private Long addAt;
    private Integer versionCode;
    private String ext;
    private Boolean guard;
    private Byte flags;

    @Transient
    private boolean isSystemApp;

    @Generated(hash = 1854842808)
    public PackageInfo() {
    }

    public PackageInfo(Integer id) {
        this.id = id;
    }

    @Generated(hash = 1229310922)
    public PackageInfo(Integer id, String pkgName, String appName, Long addAt, Integer versionCode, String ext, Boolean guard, Byte flags) {
        this.id = id;
        this.pkgName = pkgName;
        this.appName = appName;
        this.addAt = addAt;
        this.versionCode = versionCode;
        this.ext = ext;
        this.guard = guard;
        this.flags = flags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Long getAddAt() {
        return addAt;
    }

    public void setAddAt(Long addAt) {
        this.addAt = addAt;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Boolean getGuard() {
        return guard;
    }

    public void setGuard(Boolean guard) {
        this.guard = guard;
    }

    public Byte getFlags() {
        return flags;
    }

    public void setFlags(Byte flags) {
        this.flags = flags;
    }

    // KEEP METHODS - put your custom methods here


    @Override
    public String toString() {
        return "PackageInfo{" +
                "id=" + id +
                ", pkgName='" + pkgName + '\'' +
                ", appName='" + appName + '\'' +
                ", addAt=" + addAt +
                ", guard=" + guard +
                ", flags=" + flags +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageInfo that = (PackageInfo) o;

        return pkgName.equals(that.pkgName);

    }

    @Override
    public int hashCode() {
        return pkgName.hashCode();
    }


    public boolean isDisabled() {
        return getFlags() != null && PkgUtil.isApplicationStateDisabled(getFlags());
    }


    public boolean isSystemApp() {
        return isSystemApp;
    }

    public void setSystemApp(boolean systemApp) {
        isSystemApp = systemApp;
    }
    // KEEP METHODS END

}

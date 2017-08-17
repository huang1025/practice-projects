import java.math.BigDecimal;
import java.util.Date;

public class CxsCallRecordIndex {
    private String id;

    private String applyCode;

    private String status;

    private Date createdTime;

    private String certNo;

    private String daybreakCallPercent;

    private Integer validCallAmount;

    private Integer mtwentyLengthNumberAmount;

    private Integer mtwentyTimesNumberAmount;

    private Integer thrMonthsActiveDays;

    private BigDecimal localCallTimes;

    private BigDecimal localCallLength;

    private String listName;

    private Integer listMonth;

    private Integer lastListMonth;

    private Integer minCallTimes;

    private Integer callNumAmount;

    private Integer minCallDay;

    private String listLocation;

    private String listNumber;

    private Double telFare;

    private Integer callingNumber1;

    private Integer callingTime1;

    private Integer calledNumber1;

    private Integer calledTime1;

    private Integer callingNumber2;

    private Integer callingTime2;

    private Integer calledNumber2;

    private Integer calledTime2;

    private Integer callingNumber3;

    private Integer callingTime3;

    private Integer calledNumber3;

    private Integer calledTime3;

    private Integer callingNumber4;

    private Integer callingTime4;

    private Integer calledNumber4;

    private Integer calledTime4;

    private Integer callingNumber5;

    private Integer callingTime5;

    private Integer calledNumber5;

    private Integer calledTime5;

    private Integer callingNumber6;

    private Integer callingTime6;

    private Integer calledNumber6;

    private Integer calledTime6;

    private String xdshPhone; //接口文档没有看到此值

    private String localPhone;

    private String nonLocalPhone;

    private String frequentlyPhone;

    private String domicilePhone;

    private String noWorkFrequentlyPhone;

    private BigDecimal amount;  //接口文档没有看到此值

    private String mobileRegTime;

    private Integer mobileOnlineMonths; //接口文档没有看到此值

    private Integer validCallNum1;

    private Integer validCallNum2;

    private Integer validCallNum3;

    private Integer validCallNum4;

    private Integer validCallNum5;

    private Integer validCallNum6;

    private BigDecimal activeDayRatio1;

    private BigDecimal activeDayRatio2;

    private BigDecimal activeDayRatio3;

    private BigDecimal activeDayRatio4;

    private BigDecimal activeDayRatio5;

    private BigDecimal activeDayRatio6;

    private Integer m6Numofcall228;

    private Integer m6CallTime22374;

    private Integer callLocalNumber1;

    private Integer callFieldNumber1;

    private Integer callLocalNumber2;

    private Integer callFieldNumber2;

    private Integer callLocalNumber3;

    private Integer callFieldNumber3;

    private Integer callLocalNumber6;

    private Integer callFieldNumber6;

    private Integer callLocalNumber6Total;

    private Integer callFieldNumber6Total;

    private Integer callingNumber6Total;

    private Integer calledNumber6Total;

    private Integer mfifteenTimesNumberAmount;

    private Double teleOpenTime;

    private Integer m3CallTimes;

    private Integer m3CallDays;

    private Double m3P1Std;

    private Double m3P1Ave;

    private Double m3P2Std;

    private Double m3P2Ave;

    private Double m2DurationWeehourRate;

    private Integer m3NocallDays;

    private String m3MainPhone;

    private BigDecimal m3MainPhoneRatio;

    private Integer minCallTimes1m;

    private Integer minCallTimes2m;

    private Integer minCallTimes3m;

    private Integer minCallTimes4m;

    private Integer minCallTimes5m;

    private Integer minCallTimes6m;

    private BigDecimal l2mMostNoVar;

    private Integer l3mNwktRejectFreq;

    private BigDecimal l3mB3TmsStd;

    private BigDecimal l3mH1AvgTmP;

    private BigDecimal l3mH4TmsStd;

    private BigDecimal l3mFrequencyWeehourRate;

    private BigDecimal l3mFxObCntr2;

    private BigDecimal l3mLclFxObClsr;

    private Integer l2mNewNlclFxIbCntGt20;

    private Integer l2mNewlMobile;

    private BigDecimal l1mCompWkdNumRate;

    private Integer l1mmK3NwktTms;

    private Integer l3mHkCalledTm20;

    private BigDecimal l1mI3AvgTmP;

    private BigDecimal l2mI3CalledTmsP;

    private Integer l2mNeweMobile;

    private BigDecimal l3mClsSecsiter;

    private Integer l6mDucS2mnMax;

    private Integer l6mNc6AftDmax;

    private BigDecimal l6mNc6DnDstd;

    private Integer l6mNwdBssMax;

    private BigDecimal l3mMorClsr;

    private BigDecimal l3mmC3AvgTm;

    private BigDecimal l3mHkTmsStd;

    private BigDecimal relation;

    private String systemInfo;

    private String deviceType;

    private BigDecimal m3CompPhoneRatio;

    private String m3UnitPhoneRatio;

    private Integer last2wEverydayDunSumcallin;

    private Integer last6mWsTimesCallin;

    private Integer last1wTimesCallin;

    private Integer last4mTimesDunCallin;

    private Integer last4mEverydayDunSumlianxi;

    private Integer last1wMaxTimesLianxi;

    private Integer last2wMaxDaysLianxi;

    private Integer last4mWsSjDaysCallout;

    private BigDecimal l6mDnCltMean;
    private BigDecimal l3mNigClmn;
    private BigDecimal l2mK2NgtTmsRate;
    private BigDecimal l3mMblIbCnt;

    public BigDecimal getL6mDnCltMean() {
        return l6mDnCltMean;
    }

    public void setL6mDnCltMean(BigDecimal l6mDnCltMean) {
        this.l6mDnCltMean = l6mDnCltMean;
    }

    public BigDecimal getL3mNigClmn() {
        return l3mNigClmn;
    }

    public void setL3mNigClmn(BigDecimal l3mNigClmn) {
        this.l3mNigClmn = l3mNigClmn;
    }

    public BigDecimal getL2mK2NgtTmsRate() {
        return l2mK2NgtTmsRate;
    }

    public void setL2mK2NgtTmsRate(BigDecimal l2mK2NgtTmsRate) {
        this.l2mK2NgtTmsRate = l2mK2NgtTmsRate;
    }

    public BigDecimal getL3mMblIbCnt() {
        return l3mMblIbCnt;
    }

    public void setL3mMblIbCnt(BigDecimal l3mMblIbCnt) {
        this.l3mMblIbCnt = l3mMblIbCnt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getDaybreakCallPercent() {
        return daybreakCallPercent;
    }

    public void setDaybreakCallPercent(String daybreakCallPercent) {
        this.daybreakCallPercent = daybreakCallPercent;
    }

    public Integer getValidCallAmount() {
        return validCallAmount;
    }

    public void setValidCallAmount(Integer validCallAmount) {
        this.validCallAmount = validCallAmount;
    }

    public Integer getMtwentyLengthNumberAmount() {
        return mtwentyLengthNumberAmount;
    }

    public void setMtwentyLengthNumberAmount(Integer mtwentyLengthNumberAmount) {
        this.mtwentyLengthNumberAmount = mtwentyLengthNumberAmount;
    }

    public Integer getMtwentyTimesNumberAmount() {
        return mtwentyTimesNumberAmount;
    }

    public void setMtwentyTimesNumberAmount(Integer mtwentyTimesNumberAmount) {
        this.mtwentyTimesNumberAmount = mtwentyTimesNumberAmount;
    }

    public Integer getThrMonthsActiveDays() {
        return thrMonthsActiveDays;
    }

    public void setThrMonthsActiveDays(Integer thrMonthsActiveDays) {
        this.thrMonthsActiveDays = thrMonthsActiveDays;
    }

    public BigDecimal getLocalCallTimes() {
        return localCallTimes;
    }

    public void setLocalCallTimes(BigDecimal localCallTimes) {
        this.localCallTimes = localCallTimes;
    }

    public BigDecimal getLocalCallLength() {
        return localCallLength;
    }

    public void setLocalCallLength(BigDecimal localCallLength) {
        this.localCallLength = localCallLength;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Integer getListMonth() {
        return listMonth;
    }

    public void setListMonth(Integer listMonth) {
        this.listMonth = listMonth;
    }

    public Integer getLastListMonth() {
        return lastListMonth;
    }

    public void setLastListMonth(Integer lastListMonth) {
        this.lastListMonth = lastListMonth;
    }

    public Integer getMinCallTimes() {
        return minCallTimes;
    }

    public void setMinCallTimes(Integer minCallTimes) {
        this.minCallTimes = minCallTimes;
    }

    public Integer getCallNumAmount() {
        return callNumAmount;
    }

    public void setCallNumAmount(Integer callNumAmount) {
        this.callNumAmount = callNumAmount;
    }

    public Integer getMinCallDay() {
        return minCallDay;
    }

    public void setMinCallDay(Integer minCallDay) {
        this.minCallDay = minCallDay;
    }

    public String getListLocation() {
        return listLocation;
    }

    public void setListLocation(String listLocation) {
        this.listLocation = listLocation;
    }

    public String getListNumber() {
        return listNumber;
    }

    public void setListNumber(String listNumber) {
        this.listNumber = listNumber;
    }

    public Double getTelFare() {
        return telFare;
    }

    public void setTelFare(Double telFare) {
        this.telFare = telFare;
    }

    public Integer getCallingNumber1() {
        return callingNumber1;
    }

    public void setCallingNumber1(Integer callingNumber1) {
        this.callingNumber1 = callingNumber1;
    }

    public Integer getCallingTime1() {
        return callingTime1;
    }

    public void setCallingTime1(Integer callingTime1) {
        this.callingTime1 = callingTime1;
    }

    public Integer getCalledNumber1() {
        return calledNumber1;
    }

    public void setCalledNumber1(Integer calledNumber1) {
        this.calledNumber1 = calledNumber1;
    }

    public Integer getCalledTime1() {
        return calledTime1;
    }

    public void setCalledTime1(Integer calledTime1) {
        this.calledTime1 = calledTime1;
    }

    public Integer getCallingNumber2() {
        return callingNumber2;
    }

    public void setCallingNumber2(Integer callingNumber2) {
        this.callingNumber2 = callingNumber2;
    }

    public Integer getCallingTime2() {
        return callingTime2;
    }

    public void setCallingTime2(Integer callingTime2) {
        this.callingTime2 = callingTime2;
    }

    public Integer getCalledNumber2() {
        return calledNumber2;
    }

    public void setCalledNumber2(Integer calledNumber2) {
        this.calledNumber2 = calledNumber2;
    }

    public Integer getCalledTime2() {
        return calledTime2;
    }

    public void setCalledTime2(Integer calledTime2) {
        this.calledTime2 = calledTime2;
    }

    public Integer getCallingNumber3() {
        return callingNumber3;
    }

    public void setCallingNumber3(Integer callingNumber3) {
        this.callingNumber3 = callingNumber3;
    }

    public Integer getCallingTime3() {
        return callingTime3;
    }

    public void setCallingTime3(Integer callingTime3) {
        this.callingTime3 = callingTime3;
    }

    public Integer getCalledNumber3() {
        return calledNumber3;
    }

    public void setCalledNumber3(Integer calledNumber3) {
        this.calledNumber3 = calledNumber3;
    }

    public Integer getCalledTime3() {
        return calledTime3;
    }

    public void setCalledTime3(Integer calledTime3) {
        this.calledTime3 = calledTime3;
    }

    public Integer getCallingNumber4() {
        return callingNumber4;
    }

    public void setCallingNumber4(Integer callingNumber4) {
        this.callingNumber4 = callingNumber4;
    }

    public Integer getCallingTime4() {
        return callingTime4;
    }

    public void setCallingTime4(Integer callingTime4) {
        this.callingTime4 = callingTime4;
    }

    public Integer getCalledNumber4() {
        return calledNumber4;
    }

    public void setCalledNumber4(Integer calledNumber4) {
        this.calledNumber4 = calledNumber4;
    }

    public Integer getCalledTime4() {
        return calledTime4;
    }

    public void setCalledTime4(Integer calledTime4) {
        this.calledTime4 = calledTime4;
    }

    public Integer getCallingNumber5() {
        return callingNumber5;
    }

    public void setCallingNumber5(Integer callingNumber5) {
        this.callingNumber5 = callingNumber5;
    }

    public Integer getCallingTime5() {
        return callingTime5;
    }

    public void setCallingTime5(Integer callingTime5) {
        this.callingTime5 = callingTime5;
    }

    public Integer getCalledNumber5() {
        return calledNumber5;
    }

    public void setCalledNumber5(Integer calledNumber5) {
        this.calledNumber5 = calledNumber5;
    }

    public Integer getCalledTime5() {
        return calledTime5;
    }

    public void setCalledTime5(Integer calledTime5) {
        this.calledTime5 = calledTime5;
    }

    public Integer getCallingNumber6() {
        return callingNumber6;
    }

    public void setCallingNumber6(Integer callingNumber6) {
        this.callingNumber6 = callingNumber6;
    }

    public Integer getCallingTime6() {
        return callingTime6;
    }

    public void setCallingTime6(Integer callingTime6) {
        this.callingTime6 = callingTime6;
    }

    public Integer getCalledNumber6() {
        return calledNumber6;
    }

    public void setCalledNumber6(Integer calledNumber6) {
        this.calledNumber6 = calledNumber6;
    }

    public Integer getCalledTime6() {
        return calledTime6;
    }

    public void setCalledTime6(Integer calledTime6) {
        this.calledTime6 = calledTime6;
    }

    public String getXdshPhone() {
        return xdshPhone;
    }

    public void setXdshPhone(String xdshPhone) {
        this.xdshPhone = xdshPhone;
    }

    public String getLocalPhone() {
        return localPhone;
    }

    public void setLocalPhone(String localPhone) {
        this.localPhone = localPhone;
    }

    public String getNonLocalPhone() {
        return nonLocalPhone;
    }

    public void setNonLocalPhone(String nonLocalPhone) {
        this.nonLocalPhone = nonLocalPhone;
    }

    public String getFrequentlyPhone() {
        return frequentlyPhone;
    }

    public void setFrequentlyPhone(String frequentlyPhone) {
        this.frequentlyPhone = frequentlyPhone;
    }

    public String getDomicilePhone() {
        return domicilePhone;
    }

    public void setDomicilePhone(String domicilePhone) {
        this.domicilePhone = domicilePhone;
    }

    public String getNoWorkFrequentlyPhone() {
        return noWorkFrequentlyPhone;
    }

    public void setNoWorkFrequentlyPhone(String noWorkFrequentlyPhone) {
        this.noWorkFrequentlyPhone = noWorkFrequentlyPhone;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getMobileRegTime() {
        return mobileRegTime;
    }

    public void setMobileRegTime(String mobileRegTime) {
        this.mobileRegTime = mobileRegTime;
    }

    public Integer getMobileOnlineMonths() {
        return mobileOnlineMonths;
    }

    public void setMobileOnlineMonths(Integer mobileOnlineMonths) {
        this.mobileOnlineMonths = mobileOnlineMonths;
    }

    public Integer getValidCallNum1() {
        return validCallNum1;
    }

    public void setValidCallNum1(Integer validCallNum1) {
        this.validCallNum1 = validCallNum1;
    }

    public Integer getValidCallNum2() {
        return validCallNum2;
    }

    public void setValidCallNum2(Integer validCallNum2) {
        this.validCallNum2 = validCallNum2;
    }

    public Integer getValidCallNum3() {
        return validCallNum3;
    }

    public void setValidCallNum3(Integer validCallNum3) {
        this.validCallNum3 = validCallNum3;
    }

    public Integer getValidCallNum4() {
        return validCallNum4;
    }

    public void setValidCallNum4(Integer validCallNum4) {
        this.validCallNum4 = validCallNum4;
    }

    public Integer getValidCallNum5() {
        return validCallNum5;
    }

    public void setValidCallNum5(Integer validCallNum5) {
        this.validCallNum5 = validCallNum5;
    }

    public Integer getValidCallNum6() {
        return validCallNum6;
    }

    public void setValidCallNum6(Integer validCallNum6) {
        this.validCallNum6 = validCallNum6;
    }

    public BigDecimal getActiveDayRatio1() {
        return activeDayRatio1;
    }

    public void setActiveDayRatio1(BigDecimal activeDayRatio1) {
        this.activeDayRatio1 = activeDayRatio1;
    }

    public BigDecimal getActiveDayRatio2() {
        return activeDayRatio2;
    }

    public void setActiveDayRatio2(BigDecimal activeDayRatio2) {
        this.activeDayRatio2 = activeDayRatio2;
    }

    public BigDecimal getActiveDayRatio3() {
        return activeDayRatio3;
    }

    public void setActiveDayRatio3(BigDecimal activeDayRatio3) {
        this.activeDayRatio3 = activeDayRatio3;
    }

    public BigDecimal getActiveDayRatio4() {
        return activeDayRatio4;
    }

    public void setActiveDayRatio4(BigDecimal activeDayRatio4) {
        this.activeDayRatio4 = activeDayRatio4;
    }

    public BigDecimal getActiveDayRatio5() {
        return activeDayRatio5;
    }

    public void setActiveDayRatio5(BigDecimal activeDayRatio5) {
        this.activeDayRatio5 = activeDayRatio5;
    }

    public BigDecimal getActiveDayRatio6() {
        return activeDayRatio6;
    }

    public void setActiveDayRatio6(BigDecimal activeDayRatio6) {
        this.activeDayRatio6 = activeDayRatio6;
    }

    public Integer getM6Numofcall228() {
        return m6Numofcall228;
    }

    public void setM6Numofcall228(Integer m6Numofcall228) {
        this.m6Numofcall228 = m6Numofcall228;
    }

    public Integer getM6CallTime22374() {
        return m6CallTime22374;
    }

    public void setM6CallTime22374(Integer m6CallTime22374) {
        this.m6CallTime22374 = m6CallTime22374;
    }

    public Integer getCallLocalNumber1() {
        return callLocalNumber1;
    }

    public void setCallLocalNumber1(Integer callLocalNumber1) {
        this.callLocalNumber1 = callLocalNumber1;
    }

    public Integer getCallFieldNumber1() {
        return callFieldNumber1;
    }

    public void setCallFieldNumber1(Integer callFieldNumber1) {
        this.callFieldNumber1 = callFieldNumber1;
    }

    public Integer getCallLocalNumber2() {
        return callLocalNumber2;
    }

    public void setCallLocalNumber2(Integer callLocalNumber2) {
        this.callLocalNumber2 = callLocalNumber2;
    }

    public Integer getCallFieldNumber2() {
        return callFieldNumber2;
    }

    public void setCallFieldNumber2(Integer callFieldNumber2) {
        this.callFieldNumber2 = callFieldNumber2;
    }

    public Integer getCallLocalNumber3() {
        return callLocalNumber3;
    }

    public void setCallLocalNumber3(Integer callLocalNumber3) {
        this.callLocalNumber3 = callLocalNumber3;
    }

    public Integer getCallFieldNumber3() {
        return callFieldNumber3;
    }

    public void setCallFieldNumber3(Integer callFieldNumber3) {
        this.callFieldNumber3 = callFieldNumber3;
    }

    public Integer getCallLocalNumber6() {
        return callLocalNumber6;
    }

    public void setCallLocalNumber6(Integer callLocalNumber6) {
        this.callLocalNumber6 = callLocalNumber6;
    }

    public Integer getCallFieldNumber6() {
        return callFieldNumber6;
    }

    public void setCallFieldNumber6(Integer callFieldNumber6) {
        this.callFieldNumber6 = callFieldNumber6;
    }

    public Integer getCallLocalNumber6Total() {
        return callLocalNumber6Total;
    }

    public void setCallLocalNumber6Total(Integer callLocalNumber6Total) {
        this.callLocalNumber6Total = callLocalNumber6Total;
    }

    public Integer getCallFieldNumber6Total() {
        return callFieldNumber6Total;
    }

    public void setCallFieldNumber6Total(Integer callFieldNumber6Total) {
        this.callFieldNumber6Total = callFieldNumber6Total;
    }

    public Integer getCallingNumber6Total() {
        return callingNumber6Total;
    }

    public void setCallingNumber6Total(Integer callingNumber6Total) {
        this.callingNumber6Total = callingNumber6Total;
    }

    public Integer getCalledNumber6Total() {
        return calledNumber6Total;
    }

    public void setCalledNumber6Total(Integer calledNumber6Total) {
        this.calledNumber6Total = calledNumber6Total;
    }

    public Integer getMfifteenTimesNumberAmount() {
        return mfifteenTimesNumberAmount;
    }

    public void setMfifteenTimesNumberAmount(Integer mfifteenTimesNumberAmount) {
        this.mfifteenTimesNumberAmount = mfifteenTimesNumberAmount;
    }

    public Double getTeleOpenTime() {
        return teleOpenTime;
    }

    public void setTeleOpenTime(Double teleOpenTime) {
        this.teleOpenTime = teleOpenTime;
    }

    public Integer getM3CallTimes() {
        return m3CallTimes;
    }

    public void setM3CallTimes(Integer m3CallTimes) {
        this.m3CallTimes = m3CallTimes;
    }

    public Integer getM3CallDays() {
        return m3CallDays;
    }

    public void setM3CallDays(Integer m3CallDays) {
        this.m3CallDays = m3CallDays;
    }

    public Double getM3P1Std() {
        return m3P1Std;
    }

    public void setM3P1Std(Double m3P1Std) {
        this.m3P1Std = m3P1Std;
    }

    public Double getM3P1Ave() {
        return m3P1Ave;
    }

    public void setM3P1Ave(Double m3P1Ave) {
        this.m3P1Ave = m3P1Ave;
    }

    public Double getM3P2Std() {
        return m3P2Std;
    }

    public void setM3P2Std(Double m3P2Std) {
        this.m3P2Std = m3P2Std;
    }

    public Double getM3P2Ave() {
        return m3P2Ave;
    }

    public void setM3P2Ave(Double m3P2Ave) {
        this.m3P2Ave = m3P2Ave;
    }

    public Double getM2DurationWeehourRate() {
        return m2DurationWeehourRate;
    }

    public void setM2DurationWeehourRate(Double m2DurationWeehourRate) {
        this.m2DurationWeehourRate = m2DurationWeehourRate;
    }

    public Integer getM3NocallDays() {
        return m3NocallDays;
    }

    public void setM3NocallDays(Integer m3NocallDays) {
        this.m3NocallDays = m3NocallDays;
    }

    public String getM3MainPhone() {
        return m3MainPhone;
    }

    public void setM3MainPhone(String m3MainPhone) {
        this.m3MainPhone = m3MainPhone;
    }

    public BigDecimal getM3MainPhoneRatio() {
        return m3MainPhoneRatio;
    }

    public void setM3MainPhoneRatio(BigDecimal m3MainPhoneRatio) {
        this.m3MainPhoneRatio = m3MainPhoneRatio;
    }

    public Integer getMinCallTimes1m() {
        return minCallTimes1m;
    }

    public void setMinCallTimes1m(Integer minCallTimes1m) {
        this.minCallTimes1m = minCallTimes1m;
    }

    public Integer getMinCallTimes2m() {
        return minCallTimes2m;
    }

    public void setMinCallTimes2m(Integer minCallTimes2m) {
        this.minCallTimes2m = minCallTimes2m;
    }

    public Integer getMinCallTimes3m() {
        return minCallTimes3m;
    }

    public void setMinCallTimes3m(Integer minCallTimes3m) {
        this.minCallTimes3m = minCallTimes3m;
    }

    public Integer getMinCallTimes4m() {
        return minCallTimes4m;
    }

    public void setMinCallTimes4m(Integer minCallTimes4m) {
        this.minCallTimes4m = minCallTimes4m;
    }

    public Integer getMinCallTimes5m() {
        return minCallTimes5m;
    }

    public void setMinCallTimes5m(Integer minCallTimes5m) {
        this.minCallTimes5m = minCallTimes5m;
    }

    public Integer getMinCallTimes6m() {
        return minCallTimes6m;
    }

    public void setMinCallTimes6m(Integer minCallTimes6m) {
        this.minCallTimes6m = minCallTimes6m;
    }

    public BigDecimal getL2mMostNoVar() {
        return l2mMostNoVar;
    }

    public void setL2mMostNoVar(BigDecimal l2mMostNoVar) {
        this.l2mMostNoVar = l2mMostNoVar;
    }

    public Integer getL3mNwktRejectFreq() {
        return l3mNwktRejectFreq;
    }

    public void setL3mNwktRejectFreq(Integer l3mNwktRejectFreq) {
        this.l3mNwktRejectFreq = l3mNwktRejectFreq;
    }

    public BigDecimal getL3mB3TmsStd() {
        return l3mB3TmsStd;
    }

    public void setL3mB3TmsStd(BigDecimal l3mB3TmsStd) {
        this.l3mB3TmsStd = l3mB3TmsStd;
    }

    public BigDecimal getL3mH1AvgTmP() {
        return l3mH1AvgTmP;
    }

    public void setL3mH1AvgTmP(BigDecimal l3mH1AvgTmP) {
        this.l3mH1AvgTmP = l3mH1AvgTmP;
    }

    public BigDecimal getL3mH4TmsStd() {
        return l3mH4TmsStd;
    }

    public void setL3mH4TmsStd(BigDecimal l3mH4TmsStd) {
        this.l3mH4TmsStd = l3mH4TmsStd;
    }

    public BigDecimal getL3mFrequencyWeehourRate() {
        return l3mFrequencyWeehourRate;
    }

    public void setL3mFrequencyWeehourRate(BigDecimal l3mFrequencyWeehourRate) {
        this.l3mFrequencyWeehourRate = l3mFrequencyWeehourRate;
    }

    public BigDecimal getL3mFxObCntr2() {
        return l3mFxObCntr2;
    }

    public void setL3mFxObCntr2(BigDecimal l3mFxObCntr2) {
        this.l3mFxObCntr2 = l3mFxObCntr2;
    }

    public BigDecimal getL3mLclFxObClsr() {
        return l3mLclFxObClsr;
    }

    public void setL3mLclFxObClsr(BigDecimal l3mLclFxObClsr) {
        this.l3mLclFxObClsr = l3mLclFxObClsr;
    }

    public Integer getL2mNewNlclFxIbCntGt20() {
        return l2mNewNlclFxIbCntGt20;
    }

    public void setL2mNewNlclFxIbCntGt20(Integer l2mNewNlclFxIbCntGt20) {
        this.l2mNewNlclFxIbCntGt20 = l2mNewNlclFxIbCntGt20;
    }

    public Integer getL2mNewlMobile() {
        return l2mNewlMobile;
    }

    public void setL2mNewlMobile(Integer l2mNewlMobile) {
        this.l2mNewlMobile = l2mNewlMobile;
    }

    public BigDecimal getL1mCompWkdNumRate() {
        return l1mCompWkdNumRate;
    }

    public void setL1mCompWkdNumRate(BigDecimal l1mCompWkdNumRate) {
        this.l1mCompWkdNumRate = l1mCompWkdNumRate;
    }

    public Integer getL1mmK3NwktTms() {
        return l1mmK3NwktTms;
    }

    public void setL1mmK3NwktTms(Integer l1mmK3NwktTms) {
        this.l1mmK3NwktTms = l1mmK3NwktTms;
    }

    public Integer getL3mHkCalledTm20() {
        return l3mHkCalledTm20;
    }

    public void setL3mHkCalledTm20(Integer l3mHkCalledTm20) {
        this.l3mHkCalledTm20 = l3mHkCalledTm20;
    }

    public BigDecimal getL1mI3AvgTmP() {
        return l1mI3AvgTmP;
    }

    public void setL1mI3AvgTmP(BigDecimal l1mI3AvgTmP) {
        this.l1mI3AvgTmP = l1mI3AvgTmP;
    }

    public BigDecimal getL2mI3CalledTmsP() {
        return l2mI3CalledTmsP;
    }

    public void setL2mI3CalledTmsP(BigDecimal l2mI3CalledTmsP) {
        this.l2mI3CalledTmsP = l2mI3CalledTmsP;
    }

    public Integer getL2mNeweMobile() {
        return l2mNeweMobile;
    }

    public void setL2mNeweMobile(Integer l2mNeweMobile) {
        this.l2mNeweMobile = l2mNeweMobile;
    }

    public BigDecimal getL3mClsSecsiter() {
        return l3mClsSecsiter;
    }

    public void setL3mClsSecsiter(BigDecimal l3mClsSecsiter) {
        this.l3mClsSecsiter = l3mClsSecsiter;
    }

    public Integer getL6mDucS2mnMax() {
        return l6mDucS2mnMax;
    }

    public void setL6mDucS2mnMax(Integer l6mDucS2mnMax) {
        this.l6mDucS2mnMax = l6mDucS2mnMax;
    }

    public Integer getL6mNc6AftDmax() {
        return l6mNc6AftDmax;
    }

    public void setL6mNc6AftDmax(Integer l6mNc6AftDmax) {
        this.l6mNc6AftDmax = l6mNc6AftDmax;
    }

    public BigDecimal getL6mNc6DnDstd() {
        return l6mNc6DnDstd;
    }

    public void setL6mNc6DnDstd(BigDecimal l6mNc6DnDstd) {
        this.l6mNc6DnDstd = l6mNc6DnDstd;
    }

    public Integer getL6mNwdBssMax() {
        return l6mNwdBssMax;
    }

    public void setL6mNwdBssMax(Integer l6mNwdBssMax) {
        this.l6mNwdBssMax = l6mNwdBssMax;
    }

    public BigDecimal getL3mMorClsr() {
        return l3mMorClsr;
    }

    public void setL3mMorClsr(BigDecimal l3mMorClsr) {
        this.l3mMorClsr = l3mMorClsr;
    }

    public BigDecimal getL3mmC3AvgTm() {
        return l3mmC3AvgTm;
    }

    public void setL3mmC3AvgTm(BigDecimal l3mmC3AvgTm) {
        this.l3mmC3AvgTm = l3mmC3AvgTm;
    }

    public BigDecimal getL3mHkTmsStd() {
        return l3mHkTmsStd;
    }

    public void setL3mHkTmsStd(BigDecimal l3mHkTmsStd) {
        this.l3mHkTmsStd = l3mHkTmsStd;
    }

    public BigDecimal getRelation() {
        return relation;
    }

    public void setRelation(BigDecimal relation) {
        this.relation = relation;
    }

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public BigDecimal getM3CompPhoneRatio() {
        return m3CompPhoneRatio;
    }

    public void setM3CompPhoneRatio(BigDecimal m3CompPhoneRatio) {
        this.m3CompPhoneRatio = m3CompPhoneRatio;
    }

    public String getM3UnitPhoneRatio() {
        return m3UnitPhoneRatio;
    }

    public void setM3UnitPhoneRatio(String m3UnitPhoneRatio) {
        this.m3UnitPhoneRatio = m3UnitPhoneRatio == null ? null : m3UnitPhoneRatio.trim();
    }

    public Integer getLast2wEverydayDunSumcallin() {
        return last2wEverydayDunSumcallin;
    }

    public void setLast2wEverydayDunSumcallin(Integer last2wEverydayDunSumcallin) {
        this.last2wEverydayDunSumcallin = last2wEverydayDunSumcallin;
    }

    public Integer getLast6mWsTimesCallin() {
        return last6mWsTimesCallin;
    }

    public void setLast6mWsTimesCallin(Integer last6mWsTimesCallin) {
        this.last6mWsTimesCallin = last6mWsTimesCallin;
    }

    public Integer getLast1wTimesCallin() {
        return last1wTimesCallin;
    }

    public void setLast1wTimesCallin(Integer last1wTimesCallin) {
        this.last1wTimesCallin = last1wTimesCallin;
    }

    public Integer getLast4mTimesDunCallin() {
        return last4mTimesDunCallin;
    }

    public void setLast4mTimesDunCallin(Integer last4mTimesDunCallin) {
        this.last4mTimesDunCallin = last4mTimesDunCallin;
    }

    public Integer getLast4mEverydayDunSumlianxi() {
        return last4mEverydayDunSumlianxi;
    }

    public void setLast4mEverydayDunSumlianxi(Integer last4mEverydayDunSumlianxi) {
        this.last4mEverydayDunSumlianxi = last4mEverydayDunSumlianxi;
    }

    public Integer getLast1wMaxTimesLianxi() {
        return last1wMaxTimesLianxi;
    }

    public void setLast1wMaxTimesLianxi(Integer last1wMaxTimesLianxi) {
        this.last1wMaxTimesLianxi = last1wMaxTimesLianxi;
    }

    public Integer getLast2wMaxDaysLianxi() {
        return last2wMaxDaysLianxi;
    }

    public void setLast2wMaxDaysLianxi(Integer last2wMaxDaysLianxi) {
        this.last2wMaxDaysLianxi = last2wMaxDaysLianxi;
    }

    public Integer getLast4mWsSjDaysCallout() {
        return last4mWsSjDaysCallout;
    }

    public void setLast4mWsSjDaysCallout(Integer last4mWsSjDaysCallout) {
        this.last4mWsSjDaysCallout = last4mWsSjDaysCallout;
    }

    @Override
    public String toString() {
        return "CxsCallRecordIndex{" +
                "id='" + id + '\'' +
                ", applyCode='" + applyCode + '\'' +
                ", status='" + status + '\'' +
                ", createdTime=" + createdTime +
                ", certNo='" + certNo + '\'' +
                ", daybreakCallPercent='" + daybreakCallPercent + '\'' +
                ", validCallAmount=" + validCallAmount +
                ", mtwentyLengthNumberAmount=" + mtwentyLengthNumberAmount +
                ", mtwentyTimesNumberAmount=" + mtwentyTimesNumberAmount +
                ", thrMonthsActiveDays=" + thrMonthsActiveDays +
                ", localCallTimes=" + localCallTimes +
                ", localCallLength=" + localCallLength +
                ", listName='" + listName + '\'' +
                ", listMonth=" + listMonth +
                ", lastListMonth=" + lastListMonth +
                ", minCallTimes=" + minCallTimes +
                ", callNumAmount=" + callNumAmount +
                ", minCallDay=" + minCallDay +
                ", listLocation='" + listLocation + '\'' +
                ", listNumber='" + listNumber + '\'' +
                ", telFare=" + telFare +
                ", callingNumber1=" + callingNumber1 +
                ", callingTime1=" + callingTime1 +
                ", calledNumber1=" + calledNumber1 +
                ", calledTime1=" + calledTime1 +
                ", callingNumber2=" + callingNumber2 +
                ", callingTime2=" + callingTime2 +
                ", calledNumber2=" + calledNumber2 +
                ", calledTime2=" + calledTime2 +
                ", callingNumber3=" + callingNumber3 +
                ", callingTime3=" + callingTime3 +
                ", calledNumber3=" + calledNumber3 +
                ", calledTime3=" + calledTime3 +
                ", callingNumber4=" + callingNumber4 +
                ", callingTime4=" + callingTime4 +
                ", calledNumber4=" + calledNumber4 +
                ", calledTime4=" + calledTime4 +
                ", callingNumber5=" + callingNumber5 +
                ", callingTime5=" + callingTime5 +
                ", calledNumber5=" + calledNumber5 +
                ", calledTime5=" + calledTime5 +
                ", callingNumber6=" + callingNumber6 +
                ", callingTime6=" + callingTime6 +
                ", calledNumber6=" + calledNumber6 +
                ", calledTime6=" + calledTime6 +
                ", xdshPhone='" + xdshPhone + '\'' +
                ", localPhone='" + localPhone + '\'' +
                ", nonLocalPhone='" + nonLocalPhone + '\'' +
                ", frequentlyPhone='" + frequentlyPhone + '\'' +
                ", domicilePhone='" + domicilePhone + '\'' +
                ", noWorkFrequentlyPhone='" + noWorkFrequentlyPhone + '\'' +
                ", amount=" + amount +
                ", mobileRegTime='" + mobileRegTime + '\'' +
                ", mobileOnlineMonths=" + mobileOnlineMonths +
                ", validCallNum1=" + validCallNum1 +
                ", validCallNum2=" + validCallNum2 +
                ", validCallNum3=" + validCallNum3 +
                ", validCallNum4=" + validCallNum4 +
                ", validCallNum5=" + validCallNum5 +
                ", validCallNum6=" + validCallNum6 +
                ", activeDayRatio1=" + activeDayRatio1 +
                ", activeDayRatio2=" + activeDayRatio2 +
                ", activeDayRatio3=" + activeDayRatio3 +
                ", activeDayRatio4=" + activeDayRatio4 +
                ", activeDayRatio5=" + activeDayRatio5 +
                ", activeDayRatio6=" + activeDayRatio6 +
                ", m6Numofcall228=" + m6Numofcall228 +
                ", m6CallTime22374=" + m6CallTime22374 +
                ", callLocalNumber1=" + callLocalNumber1 +
                ", callFieldNumber1=" + callFieldNumber1 +
                ", callLocalNumber2=" + callLocalNumber2 +
                ", callFieldNumber2=" + callFieldNumber2 +
                ", callLocalNumber3=" + callLocalNumber3 +
                ", callFieldNumber3=" + callFieldNumber3 +
                ", callLocalNumber6=" + callLocalNumber6 +
                ", callFieldNumber6=" + callFieldNumber6 +
                ", callLocalNumber6Total=" + callLocalNumber6Total +
                ", callFieldNumber6Total=" + callFieldNumber6Total +
                ", callingNumber6Total=" + callingNumber6Total +
                ", calledNumber6Total=" + calledNumber6Total +
                ", mfifteenTimesNumberAmount=" + mfifteenTimesNumberAmount +
                ", teleOpenTime=" + teleOpenTime +
                ", m3CallTimes=" + m3CallTimes +
                ", m3CallDays=" + m3CallDays +
                ", m3P1Std=" + m3P1Std +
                ", m3P1Ave=" + m3P1Ave +
                ", m3P2Std=" + m3P2Std +
                ", m3P2Ave=" + m3P2Ave +
                ", m2DurationWeehourRate=" + m2DurationWeehourRate +
                ", m3NocallDays=" + m3NocallDays +
                ", m3MainPhone='" + m3MainPhone + '\'' +
                ", m3MainPhoneRatio=" + m3MainPhoneRatio +
                ", minCallTimes1m=" + minCallTimes1m +
                ", minCallTimes2m=" + minCallTimes2m +
                ", minCallTimes3m=" + minCallTimes3m +
                ", minCallTimes4m=" + minCallTimes4m +
                ", minCallTimes5m=" + minCallTimes5m +
                ", minCallTimes6m=" + minCallTimes6m +
                ", l2mMostNoVar=" + l2mMostNoVar +
                ", l3mNwktRejectFreq=" + l3mNwktRejectFreq +
                ", l3mB3TmsStd=" + l3mB3TmsStd +
                ", l3mH1AvgTmP=" + l3mH1AvgTmP +
                ", l3mH4TmsStd=" + l3mH4TmsStd +
                ", l3mFrequencyWeehourRate=" + l3mFrequencyWeehourRate +
                ", l3mFxObCntr2=" + l3mFxObCntr2 +
                ", l3mLclFxObClsr=" + l3mLclFxObClsr +
                ", l2mNewNlclFxIbCntGt20=" + l2mNewNlclFxIbCntGt20 +
                ", l2mNewlMobile=" + l2mNewlMobile +
                ", l1mCompWkdNumRate=" + l1mCompWkdNumRate +
                ", l1mmK3NwktTms=" + l1mmK3NwktTms +
                ", l3mHkCalledTm20=" + l3mHkCalledTm20 +
                ", l1mI3AvgTmP=" + l1mI3AvgTmP +
                ", l2mI3CalledTmsP=" + l2mI3CalledTmsP +
                ", l2mNeweMobile=" + l2mNeweMobile +
                ", l3mClsSecsiter=" + l3mClsSecsiter +
                ", l6mDucS2mnMax=" + l6mDucS2mnMax +
                ", l6mNc6AftDmax=" + l6mNc6AftDmax +
                ", l6mNc6DnDstd=" + l6mNc6DnDstd +
                ", l6mNwdBssMax=" + l6mNwdBssMax +
                ", l3mMorClsr=" + l3mMorClsr +
                ", l3mmC3AvgTm=" + l3mmC3AvgTm +
                ", l3mHkTmsStd=" + l3mHkTmsStd +
                ", relation=" + relation +
                ", systemInfo='" + systemInfo + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", m3CompPhoneRatio=" + m3CompPhoneRatio +
                ", m3UnitPhoneRatio='" + m3UnitPhoneRatio + '\'' +
                ", last2wEverydayDunSumcallin=" + last2wEverydayDunSumcallin +
                ", last6mWsTimesCallin=" + last6mWsTimesCallin +
                ", last1wTimesCallin=" + last1wTimesCallin +
                ", last4mTimesDunCallin=" + last4mTimesDunCallin +
                ", last4mEverydayDunSumlianxi=" + last4mEverydayDunSumlianxi +
                ", last1wMaxTimesLianxi=" + last1wMaxTimesLianxi +
                ", last2wMaxDaysLianxi=" + last2wMaxDaysLianxi +
                ", last4mWsSjDaysCallout=" + last4mWsSjDaysCallout +
                '}';
    }
}
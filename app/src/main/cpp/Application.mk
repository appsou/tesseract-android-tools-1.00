# ARMv7 is significanly faster due to the use of the hardware FPU
APP_STL := gnustl_static
APP_ABI := armeabi x86
APP_OPTIM := release
APP_PLATFORM := android-17
APP_CFLAGS += -Wno-error=format-security
APP_CPPFLAGS += -fexceptions -frtti

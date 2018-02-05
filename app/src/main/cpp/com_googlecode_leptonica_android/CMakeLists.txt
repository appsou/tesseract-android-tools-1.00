cmake_minimum_required(VERSION 3.4.1)

SET(CMAKE_C_FLAGS "-DAVOID_TABLES -fstrict-aliasing -fprefetch-loop-arrays -Wno-unused-parameter")

file(GLOB jpeg_src ../jpeg-6b)

add_library( # Sets the name of the library.
             jpeg

             # Sets the library as a shared library.
             STATIC

             # Provides a relative path to your source file(s).
             ${jpeg_src}/jcapimin.c
             ${jpeg_src}/jcapistd.c
             ${jpeg_src}/jccoefct.c
             ${jpeg_src}/jccolor.c
             ${jpeg_src}/jcdctmgr.c
             ${jpeg_src}/jchuff.c
             ${jpeg_src}/jcinit.c
             ${jpeg_src}/jcmainct.c
             ${jpeg_src}/jcmarker.c
             ${jpeg_src}/jcmaster.c
             ${jpeg_src}/jcomapi.c
             ${jpeg_src}/jcparam.c
             ${jpeg_src}/jcphuff.c
             ${jpeg_src}/jcprepct.c
             ${jpeg_src}/jcsample.c
             ${jpeg_src}/jctrans.c
             ${jpeg_src}/jdapimin.c
             ${jpeg_src}/jdapistd.c
             ${jpeg_src}/jdatadst.c
             ${jpeg_src}/jdatasrc.c
             ${jpeg_src}/jdcoefct.c
             ${jpeg_src}/jdcolor.c
             ${jpeg_src}/jddctmgr.c
             ${jpeg_src}/jdhuff.c
             ${jpeg_src}/jdinput.c
             ${jpeg_src}/jdmainct.c
             ${jpeg_src}/jdmarker.c
             ${jpeg_src}/jdmaster.c
             ${jpeg_src}/jdmerge.c
             ${jpeg_src}/jdphuff.c
             ${jpeg_src}/jdpostct.c
             ${jpeg_src}/jdsample.c
             ${jpeg_src}/jdtrans.c
             ${jpeg_src}/jerror.c
             ${jpeg_src}/jfdctflt.c
             ${jpeg_src}/jfdctfst.c
             ${jpeg_src}/jfdctint.c
             ${jpeg_src}/jidctflt.c
             ${jpeg_src}/jidctfst.c
             ${jpeg_src}/jidctint.c
             ${jpeg_src}/jidctred.c
             ${jpeg_src}/jquant1.c
             ${jpeg_src}/jquant2.c
             ${jpeg_src}/jutils.c
             ${jpeg_src}/jmemmgr.c
             ${jpeg_src}/jmemnobs.c )

if(${ANDROID_ABI} STREQUAL "armeabi")
    include_directories(${ANDROID_SYSROOT}/usr/include/arm-linux-androideabi)
elseif(${ANDROID_ABI} STREQUAL "x86")
    include_directories(${ANDROID_SYSROOT}/usr/include/i686-linux-android)
endif()

SET(CMAKE_C_FLAGS "-D__ANDROID_API__=17 -DHAVE_CONFIG_H -DHAVE_JNIGRAPHICS")

file(GLOB lept_src ../leptonica-1.69/src)

add_library( # Sets the name of the library.
             lept

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             ${lept_src}/adaptmap.c
             ${lept_src}/affine.c
             ${lept_src}/affinecompose.c
             ${lept_src}/arithlow.c
             ${lept_src}/arrayaccess.c
             ${lept_src}/bardecode.c
             ${lept_src}/baseline.c
             ${lept_src}/bbuffer.c
             ${lept_src}/bilinear.c
             ${lept_src}/binarize.c
             ${lept_src}/binexpand.c
             ${lept_src}/binexpandlow.c
             ${lept_src}/binreduce.c
             ${lept_src}/binreducelow.c
             ${lept_src}/blend.c
             ${lept_src}/bmf.c
             ${lept_src}/bmpio.c
             ${lept_src}/bmpiostub.c
             ${lept_src}/boxbasic.c
             ${lept_src}/boxfunc1.c
             ${lept_src}/boxfunc2.c
             ${lept_src}/boxfunc3.c
             ${lept_src}/boxfunc4.c
             ${lept_src}/bytearray.c
             ${lept_src}/ccbord.c
             ${lept_src}/ccthin.c
             ${lept_src}/classapp.c
             ${lept_src}/colorcontent.c
             ${lept_src}/coloring.c
             ${lept_src}/colormap.c
             ${lept_src}/colormorph.c
             ${lept_src}/colorquant1.c
             ${lept_src}/colorquant2.c
             ${lept_src}/colorseg.c
             ${lept_src}/colorspace.c
             ${lept_src}/compare.c
             ${lept_src}/conncomp.c
             ${lept_src}/convertfiles.c
             ${lept_src}/convolve.c
             ${lept_src}/convolvelow.c
             ${lept_src}/correlscore.c
             ${lept_src}/dewarp.c
             ${lept_src}/dnabasic.c
             ${lept_src}/dwacomb.2.c
             ${lept_src}/dwacomblow.2.c
             ${lept_src}/edge.c
             ${lept_src}/enhance.c
             ${lept_src}/fhmtauto.c
             ${lept_src}/fhmtgen.1.c
             ${lept_src}/fhmtgenlow.1.c
             ${lept_src}/finditalic.c
             ${lept_src}/flipdetect.c
             ${lept_src}/fliphmtgen.c
             ${lept_src}/fmorphauto.c
             ${lept_src}/fmorphgen.1.c
             ${lept_src}/fmorphgenlow.1.c
             ${lept_src}/fpix1.c
             ${lept_src}/fpix2.c
             ${lept_src}/gifio.c
             ${lept_src}/gifiostub.c
             ${lept_src}/gplot.c
             ${lept_src}/graphics.c
             ${lept_src}/graymorph.c
             ${lept_src}/graymorphlow.c
             ${lept_src}/grayquant.c
             ${lept_src}/grayquantlow.c
             ${lept_src}/heap.c
             ${lept_src}/jbclass.c
             ${lept_src}/jpegio.c
             ${lept_src}/jpegiostub.c
             ${lept_src}/kernel.c
             ${lept_src}/leptwin.c
             ${lept_src}/libversions.c
             ${lept_src}/list.c
             ${lept_src}/maze.c
             ${lept_src}/morph.c
             ${lept_src}/morphapp.c
             ${lept_src}/morphdwa.c
             ${lept_src}/morphseq.c
             ${lept_src}/numabasic.c
             ${lept_src}/numafunc1.c
             ${lept_src}/numafunc2.c
             ${lept_src}/pageseg.c
             ${lept_src}/paintcmap.c
             ${lept_src}/parseprotos.c
             ${lept_src}/partition.c
             ${lept_src}/pdfio.c
             ${lept_src}/pdfiostub.c
             ${lept_src}/pix1.c
             ${lept_src}/pix2.c
             ${lept_src}/pix3.c
             ${lept_src}/pix4.c
             ${lept_src}/pix5.c
             ${lept_src}/pixabasic.c
             ${lept_src}/pixacc.c
             ${lept_src}/pixafunc1.c
             ${lept_src}/pixafunc2.c
             ${lept_src}/pixalloc.c
             ${lept_src}/pixarith.c
             ${lept_src}/pixcomp.c
             ${lept_src}/pixconv.c
             ${lept_src}/pixtiling.c
             ${lept_src}/pngio.c
             ${lept_src}/pngiostub.c
             ${lept_src}/pnmio.c
             ${lept_src}/pnmiostub.c
             ${lept_src}/projective.c
             ${lept_src}/psio1.c
             ${lept_src}/psio1stub.c
             ${lept_src}/psio2.c
             ${lept_src}/psio2stub.c
             ${lept_src}/ptabasic.c
             ${lept_src}/ptafunc1.c
             ${lept_src}/ptra.c
             ${lept_src}/quadtree.c
             ${lept_src}/queue.c
             ${lept_src}/rank.c
             ${lept_src}/readbarcode.c
             ${lept_src}/readfile.c
             ${lept_src}/regutils.c
             ${lept_src}/rop.c
             ${lept_src}/ropiplow.c
             ${lept_src}/roplow.c
             ${lept_src}/rotate.c
             ${lept_src}/rotateam.c
             ${lept_src}/rotateamlow.c
             ${lept_src}/rotateorth.c
             ${lept_src}/rotateorthlow.c
             ${lept_src}/rotateshear.c
             ${lept_src}/runlength.c
             ${lept_src}/sarray.c
             ${lept_src}/scale.c
             ${lept_src}/scalelow.c
             ${lept_src}/seedfill.c
             ${lept_src}/seedfilllow.c
             ${lept_src}/sel1.c
             ${lept_src}/sel2.c
             ${lept_src}/selgen.c
             ${lept_src}/shear.c
             ${lept_src}/skew.c
             ${lept_src}/spixio.c
             ${lept_src}/stack.c
             ${lept_src}/sudoku.c
             ${lept_src}/textops.c
             ${lept_src}/tiffio.c
             ${lept_src}/tiffiostub.c
             ${lept_src}/utils.c
             ${lept_src}/viewfiles.c
             ${lept_src}/warper.c
             ${lept_src}/watershed.c
             ${lept_src}/webpio.c
             ${lept_src}/webpiostub.c
             ${lept_src}/writefile.c
             ${lept_src}/zlibmem.c
             ${lept_src}/zlibmemstub.c

             box.cpp
             pix.cpp
             pixa.cpp
             utilities.cpp
             jni.cpp )

include_directories(${jpeg_src}/)
include_directories(${lept_src}/)
include_directories(./)

target_link_libraries( # Specifies the target library.
                       lept

                       # Links the target library to the log library
                       # included in the NDK.
                       jpeg
                       -lz
                       -llog
                       -ljnigraphics )

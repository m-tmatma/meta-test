SUMMARY = "production image"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "ssh-server-dropbear tools-debug debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL += "ethtool evtest fbset i2c-tools memtester"

IMAGE_INSTALL_append = ""

inherit image-buildinfo
IMAGE_BUILDINFO_VARS = " \
	BB_VERSION           \
	BUILD_SYS            \
	NATIVELSBSTRING      \
	TARGET_SYS           \
	MACHINE              \
	DISTRO               \
	DISTRO_VERSION       \
	TUNE_FEATURES        \
	TARGET_FPU           \
"


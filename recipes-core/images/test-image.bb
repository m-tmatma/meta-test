SUMMARY = "production image"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "ssh-server-dropbear tools-debug debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL += "ethtool evtest fbset i2c-tools memtester"

